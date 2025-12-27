package com.constructor.level1;

public class Book {
	String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    // Parameterized constructor
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Display method (to verify)
    public void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }

    public static void main(String[] args) {

        // Using default constructor
        Book b1 = new Book();
        b1.display();

        System.out.println();

        // Using parameterized constructor
        Book b2 = new Book("Java Book", "Priyanshu Kumar", 550.75);
        b2.display();
    }
}
