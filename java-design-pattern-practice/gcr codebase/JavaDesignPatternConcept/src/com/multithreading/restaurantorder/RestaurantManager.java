package com.multithreading.restaurantorder;

/*Problem 3: Restaurant Order Processing System
User Scenario:
A restaurant has multiple chefs (threads) preparing different dishes concurrently. Each chef
prepares their assigned dish, which takes different amounts of time.
Requirements:
● Create a Chef thread class
● Each chef prepares a specific dish with varying preparation times
● Display cooking progress and completion status
● Main thread (manager) should wait for all chefs to complete before closing the kitchen
Tasks:
1. Create 4 chef threads for dishes: “Pizza” (3 seconds), “Pasta” (2 seconds), “Salad” (1
second), “Burger” (2.5 seconds)
2. Each chef should display: “Chef [name] started preparing [dish]”
3. Simulate cooking time using Thread.sleep()
4. Display progress at 25%, 50%, 75%, and 100% completion
5. Use join() to ensure manager waits for all chefs
6. Display “Kitchen closed - All orders completed” after all threads finish
Expected Output Pattern:
Chef-1 started preparing Pizza
Chef-2 started preparing Pasta
Chef-1 preparing Pizza: 25% complete
Chef-2 preparing Pasta: 50% complete

...
Kitchen closed - All orders completed*/

public class RestaurantManager {

    public static void main(String[] args) throws InterruptedException {

        Chef c1 = new Chef("Chef-1", "Pizza", 3.0);
        Chef c2 = new Chef("Chef-2", "Pasta", 2.0);
        Chef c3 = new Chef("Chef-3", "Salad", 1.0);
        Chef c4 = new Chef("Chef-4", "Burger", 2.5);

        c1.start();
        c2.start();
        c3.start();
        c4.start();

        // Manager waits
        c1.join();
        c2.join();
        c3.join();
        c4.join();

        System.out.println("Kitchen closed - All orders completed");
    }
}
