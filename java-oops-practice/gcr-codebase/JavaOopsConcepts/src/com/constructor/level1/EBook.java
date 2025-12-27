package com.constructor.level1;

public class EBook extends BookRecord {

    String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void display() {
        System.out.println("ISBN   : " + ISBN);        // public
        System.out.println("Title  : " + title);       // protected
        System.out.println("Author : " + getAuthor()); // private via getter
        System.out.println("Format : " + fileFormat);
        System.out.println();
    }

    public static void main(String[] args) {
        EBook e = new EBook("978-111", "Core Java", "Priyanshu", "PDF");

        e.display();

        e.setAuthor("Priyanshu Kumar");
        System.out.println("Updated Author: " + e.getAuthor());
    }
}
