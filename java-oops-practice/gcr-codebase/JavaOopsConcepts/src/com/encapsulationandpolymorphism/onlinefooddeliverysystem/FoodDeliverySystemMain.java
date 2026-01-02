package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

import java.util.*;

public class FoodDeliverySystemMain {
    public static void main(String[] args) {

        List<FoodItem> order = new ArrayList<>();

        order.add(new VegItem("Paneer Pizza", 300, 2));
        order.add(new NonVegItem("Chicken Burger", 200, 3));

        double grandTotal = 0;

        for (FoodItem item : order) {
            System.out.println("--------------------------------");
            System.out.println(item.getItemDetails());

            double total = item.calculateTotalPrice();
            System.out.println("Total Price: " + total);

            Discountable d = (Discountable) item;
            double discount = d.applyDiscount();
            System.out.println(d.getDiscountDetails());
            System.out.println("Discount: " + discount);

            grandTotal += (total - discount);
        }

        System.out.println("--------------------------------");
        System.out.println("Final Amount to Pay = " + grandTotal);
    }
}

