package com.dbmsjdbc.jdbc.librarymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class LibraryService {

    private LibraryDAO dao = new LibraryDAO();

    public void borrowBook(int studentId, int bookId) {

        Connection conn = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            int stock = dao.getStock(bookId, conn);
            if (stock <= 0) {
                throw new RuntimeException("Book not available");
            }

            LocalDate today = LocalDate.now();
            LocalDate due = today.plusDays(7);

            dao.insertBorrow(studentId, bookId,
                    Date.valueOf(today),
                    Date.valueOf(due),
                    conn);

            dao.updateStock(bookId, stock - 1, conn);

            conn.commit();
            System.out.println("Book borrowed successfully.");

        } catch (Exception e) {
            try { if (conn != null) conn.rollback(); } catch (Exception ignored) {}
            System.out.println("Borrow failed: " + e.getMessage());
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception ignored) {}
        }
    }

    public void returnBook(int borrowId, int bookId) {

        Connection conn = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            LocalDate today = LocalDate.now();

            // For simplicity assume due date 7 days rule
            // In real system, fetch due_date first

            LocalDate dueDate = today.minusDays(3); // Example
            long daysLate = ChronoUnit.DAYS.between(dueDate, today);
            double fine = daysLate > 0 ? daysLate * 50 : 0;

            dao.returnBook(borrowId, Date.valueOf(today), fine, conn);

            int stock = dao.getStock(bookId, conn);
            dao.updateStock(bookId, stock + 1, conn);

            conn.commit();
            System.out.println("Book returned. Fine: " + fine);

        } catch (Exception e) {
            try { if (conn != null) conn.rollback(); } catch (Exception ignored) {}
            System.out.println("Return failed: " + e.getMessage());
        } finally {
            try { if (conn != null) conn.close(); } catch (Exception ignored) {}
        }
    }

    public void search(String title, String author, String category) {

        try (Connection conn = DBConnection.getConnection()) {

            List<String> books = dao.searchBooks(title, author, category, conn);
            books.forEach(System.out::println);

        } catch (Exception e) {
            System.out.println("Search error: " + e.getMessage());
        }
    }
}
