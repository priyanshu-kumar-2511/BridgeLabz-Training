package com.encapsulationandpolymorphism.librarymanagementsystem;

public abstract class LibraryItem {

    private String itemId;      // encapsulated
    private String title;
    private String author;

    private String borrowedBy;   // sensitive user data (hidden)
    private boolean isIssued = false;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Controlled access
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected boolean isIssued() {
        return isIssued;
    }

    protected void issueItem(String borrower) {
        this.borrowedBy = borrower;
        this.isIssued = true;
    }

    protected void returnItem() {
        borrowedBy = null;
        isIssued = false;
    }

    // Concrete method
    public String getItemDetails() {
        return itemId + " | " + title + " | " + author;
    }

    // Abstract method
    public abstract int getLoanDuration(); // days
}
