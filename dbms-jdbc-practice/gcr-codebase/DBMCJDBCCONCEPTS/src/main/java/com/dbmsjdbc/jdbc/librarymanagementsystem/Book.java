package com.dbmsjdbc.jdbc.librarymanagementsystem;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private int quantity;
    private int stock;

    public Book(int bookId, String title, String author,
                String category, int quantity, int stock) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.quantity = quantity;
        this.stock = stock;
    }

    public int getBookId() { return bookId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public int getStock() { return stock; }

    @Override
    public String toString() {
        return "Book [ID=" + bookId +", Title=" + title +", Author=" + author +", Category=" + category +", Stock=" + stock + "]";
    }
}