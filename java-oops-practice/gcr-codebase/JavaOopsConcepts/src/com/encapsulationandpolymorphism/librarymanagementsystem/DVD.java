package com.encapsulationandpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {

    public DVD(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3;   // short loan
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isIssued()) {
            issueItem(borrower);
            System.out.println("DVD reserved by " + borrower);
        } else {
            System.out.println("DVD already issued.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued();
    }
}
