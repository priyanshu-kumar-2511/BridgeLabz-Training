package com.lambdaexpressions.customsortinginecommerce;

/*2. Custom Sorting in E-Commerce
○ Scenario: An online shop wants to sort products differently based on sales
campaigns (by price, rating, discount).
○ Task: Use a lambda with Comparator to sort products dynamically.
*/
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Laptop", 60000, 4.5, 10));
        products.add(new Product("Phone", 30000, 4.7, 15));
        products.add(new Product("Headphones", 5000, 4.2, 20));
        products.add(new Product("Monitor", 15000, 4.6, 5));

        System.out.println("Original List:");
        products.forEach(System.out::println);

        System.out.println("\nSort by Price (Low to High):");
        products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating (High to Low):");
        products.sort((p1, p2) -> Double.compare(p2.getRating(), p1.getRating()));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount (High to Low):");
        products.sort((p1, p2) -> Double.compare(p2.getDiscount(), p1.getDiscount()));
        products.forEach(System.out::println);
    }
}
