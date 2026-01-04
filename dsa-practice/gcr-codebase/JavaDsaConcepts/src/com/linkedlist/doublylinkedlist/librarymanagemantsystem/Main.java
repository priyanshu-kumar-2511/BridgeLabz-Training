package com.linkedlist.doublylinkedlist.librarymanagemantsystem;

import java.util.Scanner;

/*5. Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.
Hint:
Use a doubly linked list with two pointers (next and prev) in each node to facilitate traversal in both directions.
Ensure that when removing a book, both the next and prev pointers are correctly updated.
Displaying in reverse order will require traversal from the last node using prev pointers.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LibraryLinkedList library = new LibraryLinkedList();

        while (true) {
            System.out.println("\n====== Library Management System ======");
            System.out.println("1. Add Book at Beginning");
            System.out.println("2. Add Book at End");
            System.out.println("3. Remove Book by ID");
            System.out.println("4. Update Book Availability");
            System.out.println("5. Display Books (Forward)");
            System.out.println("6. Display Books (Reverse)");
            System.out.println("7. Count Books");
            System.out.println("8. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();   // buffer clear

            switch (choice) {

                case 1:
                    System.out.print("Book ID: ");
                    int id1 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title1 = sc.nextLine();

                    System.out.print("Author: ");
                    String author1 = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre1 = sc.nextLine();

                    System.out.print("Available (true/false): ");
                    boolean avail1 = sc.nextBoolean();

                    library.addAtBeginning(title1, author1, genre1, id1, avail1);
                    break;

                case 2:
                    System.out.print("Book ID: ");
                    int id2 = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Title: ");
                    String title2 = sc.nextLine();

                    System.out.print("Author: ");
                    String author2 = sc.nextLine();

                    System.out.print("Genre: ");
                    String genre2 = sc.nextLine();

                    System.out.print("Available (true/false): ");
                    boolean avail2 = sc.nextBoolean();

                    library.addAtEnd(title2, author2, genre2, id2, avail2);
                    break;

                case 3:
                    System.out.print("Enter Book ID to remove: ");
                    library.remove(sc.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    int bid = sc.nextInt();
                    System.out.print("New Status (true/false): ");
                    boolean status = sc.nextBoolean();
                    library.updateAvailability(bid, status);
                    break;

                case 5:
                    library.displayForward();
                    break;

                case 6:
                    library.displayReverse();
                    break;

                case 7:
                    System.out.println("Total Books = " + library.count());
                    break;

                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
            }
        }
    }
}
