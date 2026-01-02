package com.encapsulationandpolymorphism.ecommerceplatform;

import java.util.ArrayList;
import java.util.List;

public class ECommercePlatformMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(1, "Laptop", 75000));
        products.add(new Clothing(2, "Laptop Bag", 3000));
        products.add(new Groceries(3, "Laptop Cover", 1200));

        BillingService.printFinalPrice(products);
    }
}