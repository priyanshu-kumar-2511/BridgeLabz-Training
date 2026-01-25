package com.collections.shoppingcart;

/*Implement a Shopping Cart
Description:
Use HashMap to store product prices.
Use LinkedHashMap to maintain the order of items added.
Use TreeMap to display items sorted by price.*/

import java.util.*;

public class ShoppingCart {

    private Map<String, Double> priceMap = new HashMap<>();
    private Map<String, Integer> cart = new LinkedHashMap<>();

    public void addProduct(String product, double price) {
        priceMap.put(product, price);
    }

    public void addToCart(String product, int quantity) {

        if (!priceMap.containsKey(product)) {
            System.out.println("Product not found: " + product);
            return;
        }

        cart.merge(product, quantity, Integer::sum);
    }

    public void displayCart() {

        System.out.println("Cart (Insertion Order):");

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            String product = entry.getKey();
            int quantity = entry.getValue();
            double price = priceMap.get(product);

            System.out.println(product + " | Qty: " + quantity +
                    " | Price: " + price);
        }
    }

    public void displaySortedByPrice() {

        System.out.println("Cart Sorted by Price:");

        TreeMap<Double, List<String>> sorted = new TreeMap<>();

        for (String product : cart.keySet()) {

            double price = priceMap.get(product);

            sorted
                .computeIfAbsent(price, p -> new ArrayList<>())
                .add(product);
        }

        for (Map.Entry<Double, List<String>> entry : sorted.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " | Price: " + entry.getKey());
            }
        }
    }

    // main method
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 800.0);
        cart.addProduct("Phone", 500.0);
        cart.addProduct("Mouse", 20.0);

        
        cart.addToCart("Laptop", 1);
        cart.addToCart("Mouse", 2);
        cart.addToCart("Phone", 1);

        cart.displayCart();
        System.out.println();
        cart.displaySortedByPrice();
    }
}
