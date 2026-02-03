package com.designpattern.librarymanagementsystem;

/*Library Management System (LMS) with GoF Patterns

System Requirements
1. Library Catalog
○ Only one catalog should exist (Singleton).
2. User Management
○ System should support multiple types of users (Student, Faculty, Librarian).
○ User creation should be dynamic (Factory).
3. Notifications
○ When new books arrive, subscribed users should get notified (Observer).
4. Book Creation
○ Books can have mandatory attributes (title) and optional attributes (author,
edition, genre).
○ Construction should be flexible (Builder).
*/

public class Main {

    public static void main(String[] args) {

        // Singleton
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        // Factory
        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr. Bob");

        student.showRole();
        faculty.showRole();

        // Observer Registration
        catalog.addObserver(student);
        catalog.addObserver(faculty);

        // Builder
        Book book = new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        // Add book (triggers Observer)
        catalog.addBook(book);
    }
}
