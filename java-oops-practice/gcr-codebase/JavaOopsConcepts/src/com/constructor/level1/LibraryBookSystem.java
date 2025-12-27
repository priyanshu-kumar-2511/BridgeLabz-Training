package com.constructor.level1;

public class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean available;

    // Constructor 
    public LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println("You have successfully borrowed \"" + title + "\"");
        } else {
            System.out.println("Sorry, \"" + title + "\" is already borrowed.");
        }
    }

    // Method to return a book
    public void returnBook() {
        if (!available) {
            available = true;
            System.out.println("You have returned \"" + title + "\"");
        } else {
            System.out.println("This book was not borrowed.");
        }
    }
    // Display status
    public void display() {
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
        System.out.println("Available  : " + available);
        System.out.println();
    }

    public static void main(String[] args) {

        LibraryBookSystem b1 = new LibraryBookSystem("Java Book", "Priyanshu Kumar", 650);

        b1.display();
        b1.borrowBook();
        b1.borrowBook();
        b1.display();
        b1.returnBook();
        b1.borrowBook();
    }
}
