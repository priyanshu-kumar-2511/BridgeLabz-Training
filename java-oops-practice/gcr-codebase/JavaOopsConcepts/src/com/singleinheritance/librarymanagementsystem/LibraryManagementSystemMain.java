package com.singleinheritance.librarymanagementsystem;

public class LibraryManagementSystemMain {
	public static void main(String[] args) {

        Book b = new Author("Clean Code", 2008, "Robert C. Martin", "Expert in software craftsmanship");

        b.displayInfo();
    }
}
