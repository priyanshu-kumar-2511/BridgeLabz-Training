package com.objectmodeling.ecommerceplatform;

public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public Order placeOrder(int orderId) {
        System.out.println(name + " placed a new order");
        return new Order(orderId, this);
    }

    public String getName() {
        return name;
    }
}
