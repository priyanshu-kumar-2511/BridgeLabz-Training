package com.objectmodeling.ecommerceplatform;

import java.util.ArrayList;
public class Order {

    private int orderId;
    private ArrayList<Product> products;   // Aggregation
    private Customer customer;             // Association

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());

        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getName() + " : ₹" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: ₹" + total);
    }
}

