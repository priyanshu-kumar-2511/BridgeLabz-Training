package com.encapsulationandpolymorphism.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {

    public Book(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14;   // 2 weeks
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isIssued()) {
            issueItem(borrower);
            System.out.println("Book reserved by " + borrower);
        } else {
            System.out.println("Book already issued.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued();
    }
}

