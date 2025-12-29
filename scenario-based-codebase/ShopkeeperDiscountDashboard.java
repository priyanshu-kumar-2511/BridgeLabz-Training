/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Discount rate constants
    static final double DISCOUNT_20 = 0.20;
    static final double DISCOUNT_10 = 0.10;
    static final double DISCOUNT_5  = 0.05;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask how many items are purchased
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double totalBill = 0;

        // Using for-loop to take item prices
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            totalBill += price;
        }

        double discount = 0;

        // Discount logic using if-else
        if (totalBill >= 5000) {
            discount = totalBill * DISCOUNT_20;
        } 
        else if (totalBill >= 3000) {
            discount = totalBill * DISCOUNT_10;
        } 
        else if (totalBill >= 1000) {
            discount = totalBill * DISCOUNT_5;
        } 
        else {
            discount = 0;
        }

        double finalAmount = totalBill - discount;

        // Display bill summary
        System.out.println("\n----- BILL SUMMARY -----");
        System.out.println("Total Bill: ₹" + totalBill);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount to Pay: ₹" + finalAmount);

        sc.close();
    }
}
