package com.dbmsjdbc.jdbc.librarymanagementsystem;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDAO {

    // Get Stock
    public int getStock(int bookId, Connection conn) throws SQLException {

        String sql = "SELECT stock FROM books WHERE book_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, bookId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("stock");
            }

            throw new SQLException("Book not found");
        }
    }

    // Update Stock
    public void updateStock(int bookId, int newStock, Connection conn) throws SQLException {

        String sql = "UPDATE books SET stock = ? WHERE book_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, newStock);
            ps.setInt(2, bookId);

            int rows = ps.executeUpdate();

            if (rows != 1) {
                throw new SQLException("Stock update failed");
            }
        }
    }

    // Insert Borrow Record (Return Generated Borrow ID)
    public int insertBorrow(int studentId, int bookId,
                            Date borrowDate, Date dueDate,
                            Connection conn) throws SQLException {

        String sql = "INSERT INTO borrow_book_records " +
                     "(student_id, book_id, borrow_date, due_date) " +
                     "VALUES (?, ?, ?, ?)";

        try (PreparedStatement ps =
                     conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            ps.setInt(1, studentId);
            ps.setInt(2, bookId);
            ps.setDate(3, borrowDate);
            ps.setDate(4, dueDate);

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                return rs.getInt(1);
            }

            throw new SQLException("Failed to retrieve borrow ID");
        }
    }

    // Get Due Date (Needed for Fine Calculation)
    public Date getDueDate(int borrowId, Connection conn) throws SQLException {

        String sql = "SELECT due_date FROM borrow_book_records WHERE borrow_id = ?";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, borrowId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getDate("due_date");
            }

            throw new SQLException("Borrow record not found");
        }
    }

    // Return Book
    public void returnBook(int borrowId, Date returnDate, double fine,
                           Connection conn) throws SQLException {

        String sql = "UPDATE borrow_book_records " +
                     "SET return_date = ?, fine = ? " +
                     "WHERE borrow_id = ? AND return_date IS NULL";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setDate(1, returnDate);
            ps.setDouble(2, fine);
            ps.setInt(3, borrowId);

            int rows = ps.executeUpdate();

            if (rows != 1) {
                throw new SQLException("Invalid borrow ID or already returned");
            }
        }
    }

    // 🔹 Secure Search with Dynamic Parameters
    public List<String> searchBooks(String title, String author,String category, Connection conn)throws SQLException {

        StringBuilder sql = new StringBuilder("SELECT * FROM books WHERE 1=1");
        List<String> results = new ArrayList<>();

        if (title != null && !title.isEmpty()) {
            sql.append(" AND title LIKE ?");
        }

        if (author != null && !author.isEmpty()) {
            sql.append(" AND author LIKE ?");
        }

        if (category != null && !category.isEmpty()) {
            sql.append(" AND category LIKE ?");
        }

        PreparedStatement ps = conn.prepareStatement(sql.toString());

        int index = 1;

        if (title != null && !title.isEmpty()) {
            ps.setString(index++, "%" + title + "%");
        }

        if (author != null && !author.isEmpty()) {
            ps.setString(index++, "%" + author + "%");
        }

        if (category != null && !category.isEmpty()) {
            ps.setString(index++, "%" + category + "%");
        }

        ResultSet rs = ps.executeQuery();

        while (rs.next()) { results.add(
                    rs.getInt("book_id") + " | " +
                    rs.getString("title") + " | " +
                    rs.getString("author") + " | " +
                    rs.getString("category") + " | Stock: " +
                    rs.getInt("stock")
            );
        }
        return results;
    }
}
