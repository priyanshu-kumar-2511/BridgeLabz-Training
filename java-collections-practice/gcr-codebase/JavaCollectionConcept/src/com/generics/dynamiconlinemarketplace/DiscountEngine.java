package com.generics.dynamiconlinemarketplace;

public class DiscountEngine {

    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discounted = product.getPrice() * (1 - percentage / 100);
        product.setPrice(discounted);
    }
}
