package com.collectors.orderrevenuesummary;

/*3. Order Revenue Summary
○ Scenario: Sum order totals per customer.
○ Task: Use Collectors.summingDouble()*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("Ravi", 1200.50),
                new Order("Anita", 2200.00),
                new Order("Ravi", 800.75),
                new Order("Karan", 1500.00),
                new Order("Anita", 500.00)
        );

        Map<String, Double> revenueByCustomer = orders.stream().collect(Collectors.groupingBy(
                        Order::getCustomerName,Collectors.summingDouble(Order::getTotalAmount)));

        revenueByCustomer.forEach((customer, total) -> System.out.println(customer + " → ₹" + total));
    }
}
