package com.dbmsjdbc.jdbc.librarymanagementsystem;

/* Exercise 3: Advanced Features
Build a library management system with:
• Book inventory
• Student borrowing records
• Fine calculation
• Search functionality with multiple filters */

import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryService service = new LibraryService();

        while (true) {

            System.out.println("\n===== Library System =====");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Search Book");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Student ID: ");
                    int sId = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bId = sc.nextInt();
                    service.borrowBook(sId, bId);
                    break;

                case 2:
                    System.out.print("Borrow ID: ");
                    int borrowId = sc.nextInt();
                    System.out.print("Book ID: ");
                    int bookId = sc.nextInt();
                    service.returnBook(borrowId, bookId);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Category: ");
                    String category = sc.nextLine();
                    service.search(title, author, category);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}