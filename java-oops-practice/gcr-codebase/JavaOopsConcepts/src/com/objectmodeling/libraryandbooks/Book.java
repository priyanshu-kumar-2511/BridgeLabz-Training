package com.objectmodeling.libraryandbooks;

public class Book {

    String bookTitle;
    String bookAuthor;

    // Constructor to create a Book object
    public Book(String bookTitle, String bookAuthor) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
    }

    // Method to display book details
    public void BookDetails() {
        System.out.println(bookTitle + " by " + bookAuthor);
    }
}

