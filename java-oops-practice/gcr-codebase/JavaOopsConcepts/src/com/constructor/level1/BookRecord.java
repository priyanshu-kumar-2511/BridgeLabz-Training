package com.constructor.level1;

public class BookRecord {

    public String ISBN;        // public
    protected String title;   // protected
    private String author;    // private

    public BookRecord(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter
    public String getAuthor() {
        return author;
    }
}
