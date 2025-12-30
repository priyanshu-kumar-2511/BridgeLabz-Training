package com.objectmodeling.libraryandbooks;

import java.util.ArrayList;

public class Library {

    String libraryName;
    ArrayList<Book> bookList; // Aggregation 

    // Constructor to create a Library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        bookList = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        bookList.add(book);
    }

    // to display all books in the Library
    public void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : bookList) {
            book.BookDetails();
        }
    }
}
