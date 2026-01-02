package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public abstract class FoodItem {

    private String itemName;     // encapsulated
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Controlled access
    public String getItemName() {
        return itemName;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    // Common behavior
    public String getItemDetails() {
        return itemName + " | Price: " + price + " | Qty: " + quantity;
    }

    // Abstract method
    public abstract double calculateTotalPrice();
}
