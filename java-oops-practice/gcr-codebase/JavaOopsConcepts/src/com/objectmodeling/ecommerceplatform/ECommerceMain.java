package com.objectmodeling.ecommerceplatform;

public class ECommerceMain {
	public static void main(String[] args) {

        // Products exist independently
        Product p1 = new Product(1, "Laptop", 60000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1200);

        // Customer
        Customer c1 = new Customer(101, "Rahul");

        // Communication: Customer → Order
        Order order1 = c1.placeOrder(5001);

        // Aggregation: Order contains Products
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        order1.showOrderDetails();
    }
}
