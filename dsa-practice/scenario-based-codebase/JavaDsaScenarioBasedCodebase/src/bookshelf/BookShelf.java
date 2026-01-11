package bookshelf;

import java.util.*;

class BookShelf {

    private HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    private HashSet<String> bookNumberTracker = new HashSet<>();

    public void addBook(Book book) {
        if (bookNumberTracker.contains(book.bookNumber)) {
            System.out.println("This book already exists!");
            return;
        }

        catalog.putIfAbsent(book.genre, new LinkedList<>());
        catalog.get(book.genre).add(book);
        bookNumberTracker.add(book.bookNumber);

        System.out.println("✅ Book added successfully!");
    }

    public void borrowBook(String bookNumber) {
        for (String genre : catalog.keySet()) {
            LinkedList<Book> list = catalog.get(genre);

            Iterator<Book> it = list.iterator();
            while (it.hasNext()) {
                Book b = it.next();
                if (b.bookNumber.equals(bookNumber)) {
                    it.remove();
                    bookNumberTracker.remove(bookNumber);
                    System.out.println("You borrowed: " + b.title);
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void showAllBooks() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        System.out.println("\nLibrary Catalog");
        for (String genre : catalog.keySet()) {
            System.out.println("\nGenre: " + genre);
            for (Book b : catalog.get(genre)) {
                System.out.println("  • " + b);
            }
        }
    }
}
