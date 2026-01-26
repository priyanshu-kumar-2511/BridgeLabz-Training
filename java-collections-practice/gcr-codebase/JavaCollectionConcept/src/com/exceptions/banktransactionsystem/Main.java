package com.exceptions.banktransactionsystem;

/*10. Bank Transaction System (Checked + Custom Exception)
💡 Problem Statement:
Develop a Bank Account System where:
withdraw(double amount) method:
Throws InsufficientBalanceException if withdrawal amount exceeds balance.
Throws IllegalArgumentException if the amount is negative.
Handle exceptions in main().
Expected Behavior:
If valid, print "Withdrawal successful, new balance: X".
If balance is insufficient, throw and handle "Insufficient balance!".
If the amount is negative, throw and handle "Invalid amount!".
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount(5000);

        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();

        try {
            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {
            System.out.println("Insufficient balance!");

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        }

        sc.close();
    }
}
