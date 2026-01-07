package digitalbookstoresystem;

import java.util.*;

public class Order {

    private String user;
    private Map<Book, Integer> items = new HashMap<>();

    private boolean completed = false;

    public Order(String user) {
        this.user = user;
    }

    public void addBook(Book book, int quantity) {
        if (completed) {
            throw new RuntimeException("Order already closed");
        }
        items.put(book, quantity);
    }

    public double calculateTotal() {
        double total = 0;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            Book book = entry.getKey();
            int qty = entry.getValue();

            double cost = book.getPrice() * qty;
            double discount = book.applyDiscount(qty);

            total += cost - discount;
        }
        return total;
    }

    public void checkout() {
        if (completed) return;

        for (Map.Entry<Book, Integer> entry : items.entrySet()) {
            entry.getKey().reduceStock(entry.getValue());
        }

        completed = true;
        System.out.println("Order placed. Total = " + calculateTotal());
    }
}
