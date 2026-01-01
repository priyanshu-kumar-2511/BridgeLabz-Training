package com.multilevelinheritance.onlineretailordermanagemnet;

public class Main {
	public static void main(String[] args) {

        Order o1 = new Order(101, "01-Jan-2025");
        Order o2 = new ShippedOrder(102, "02-Jan-2025", "TRK7788");
        Order o3 = new DeliveredOrder(103, "03-Jan-2025", "TRK8899", "05-Jan-2025");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}
