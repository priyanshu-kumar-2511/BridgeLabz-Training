package pharmacyinventoryandsalessystem;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;       
    private int quantity;       
    protected LocalDate expiryDate;

    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);   // default quantity
    }

    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected boolean reduceStock(int units) {
        if (units > quantity) return false;
        quantity -= units;
        return true;
    }

    public String getName() {
        return name;
    }
}
