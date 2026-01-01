package com.hybridinheritance.restaurantmanagementsystem;

public class Main {
	public static void main(String[] args) {

        Worker w1 = new Chef("Rahul", 101);
        Worker w2 = new Waiter("Amit", 102);

        w1.performDuties();
        w2.performDuties();
    }
}
