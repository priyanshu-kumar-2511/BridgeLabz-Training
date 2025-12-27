package com.constructor.level1;

public class Product {
	// Instance variables
    String productName;
    double price;

    // Class (static) variable
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // counts how many objects are created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
        System.out.println();
    }

    // Class (static) method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created = " + totalProducts);
    }

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 500);
        Product p3 = new Product("Keyboard", 1200);

        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        Product.displayTotalProducts();
    }
}
