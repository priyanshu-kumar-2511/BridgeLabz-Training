package com.objectmodeling.libraryandbooks;

public class LibraryAndBooks {
	public static void main(String[] args) {
	// Add details of book in list
    Book book1 = new Book("Atomic Habits", "James Clear");
    Book book2 = new Book("Clean Code", "Robert C. Martin");
    Book book3 = new Book("The Alchemist", "Paulo Coelho");

    // Create libraries
    Library centralLibrary = new Library("Central Library");

    // Add books to libraries
    centralLibrary.addBook(book1);
    centralLibrary.addBook(book2);
    centralLibrary.addBook(book3);

    // Display
    centralLibrary.showBooks();
    }
}
