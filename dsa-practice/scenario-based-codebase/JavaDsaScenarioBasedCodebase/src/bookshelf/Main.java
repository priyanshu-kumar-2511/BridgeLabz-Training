package bookshelf;

import java.util.*;

/*1. BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookShelf library = new BookShelf();

        while (true) {
            System.out.println("\n===== Welcome to Library System =====");
            System.out.println("1. Add a Book");
            System.out.println("2. Borrow a Book");
            System.out.println("3. View Library");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book Number: ");
                    String bookNumber = sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Genre: ");
                    String genre = sc.nextLine();

                    library.addBook(new Book(bookNumber, title, author, genre));
                    break;

                case 2:
                    System.out.print("Enter Book Number to borrow: ");
                    String id = sc.nextLine();
                    library.borrowBook(id);
                    break;

                case 3:
                    library.showAllBooks();
                    break;

                case 4:
                    System.out.println("Thank you for using Library System!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
