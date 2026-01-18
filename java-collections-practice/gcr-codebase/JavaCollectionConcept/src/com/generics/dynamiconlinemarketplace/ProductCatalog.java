package com.generics.dynamiconlinemarketplace;

import java.util.*;

public class ProductCatalog {

    private List<Product<?>> catalog = new ArrayList<>();

    public void addProduct(Product<?> product) {
        catalog.add(product);
        System.out.println("Added: " + product.getDetails());
    }

    public void showCatalog() {
        System.out.println("\nMarketplace Catalog:");
        for (Product<?> p : catalog) {
            System.out.println(p.getDetails());
        }
    }
}