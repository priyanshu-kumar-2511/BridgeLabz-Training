package bookshelf;

class Book {
    String bookNumber;
    String title;
    String author;
    String genre;

    public Book(String bookNumber, String title, String author, String genre) {
        this.bookNumber = bookNumber;
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String toString() {
        return title + " by " + author + " | Book Number: " + bookNumber;
    }
}
