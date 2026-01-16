package smartshelf;

import java.util.*;

public class SmartShelf {

    private List<Book> shelf = new ArrayList<>();

    // Add book and keep shelf sorted
    public void addBook(String title) {
        shelf.add(new Book(title));
        insertionSort();
        System.out.println("Book added and shelf updated");
    }

    // Insertion Sort by title (alphabetical)
    private void insertionSort() {
        for (int i = 1; i < shelf.size(); i++) {
            Book key = shelf.get(i);
            int j = i - 1;

            while (j >= 0 && shelf.get(j).title.compareToIgnoreCase(key.title) > 0) {
                shelf.set(j + 1, shelf.get(j));
                j--;
            }

            shelf.set(j + 1, key);
        }
    }

    public void showShelf() {
        if (shelf.isEmpty()) {
            System.out.println("Shelf is empty");
            return;
        }

        System.out.println("\nYour Reading List (A → Z):");
        for (Book b : shelf) {
            System.out.println("- " + b.title);
        }
    }
}
