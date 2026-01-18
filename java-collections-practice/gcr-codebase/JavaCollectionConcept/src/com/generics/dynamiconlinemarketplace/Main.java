package com.generics.dynamiconlinemarketplace;

/*2. Dynamic Online Marketplace
Concepts: Type Parameters, Generic Methods, Bounded Type Parameters
Problem Statement:
Build a generic product catalog for an online marketplace that supports various product types like Books, Clothing, and Gadgets. Each product type has a specific price range and category.
Hints:
Define a generic class Product<T> where T is restricted to a category (BookCategory, ClothingCategory, etc.).
Implement a generic method to apply discounts dynamically (<T extends Product> void applyDiscount(T product, double percentage)).
Ensure type safety while allowing multiple product categories to exist in the same catalog.
*/

public class Main {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();

        Product<BookCategory> book = new Product<>("Clean Code", 500, new BookCategory());

        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone = new Product<>("Smartphone", 20000, new GadgetCategory());

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Generic discount method
        DiscountEngine.applyDiscount(book, 10);
        DiscountEngine.applyDiscount(phone, 5);

        catalog.showCatalog();
    }
}
