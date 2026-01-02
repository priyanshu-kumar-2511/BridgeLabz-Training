package com.encapsulationandpolymorphism.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {

    public Magazine(String id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7;   // 1 week
    }

    @Override
    public void reserveItem(String borrower) {
        if (!isIssued()) {
            issueItem(borrower);
            System.out.println("Magazine reserved by " + borrower);
        } else {
            System.out.println("Magazine already issued.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isIssued();
    }
}
