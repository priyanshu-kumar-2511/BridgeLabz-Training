package com.multithreading.bankingsystem;

public class BankAccount {
	private int balance = 10000;

    public int getBalance() {
        return balance;
    }

    public void withdraw(String customerName, int amount) {

        System.out.println("[" + customerName + "] Attempting to withdraw " + amount);

        if (balance >= amount) {

            try {
                Thread.sleep(500); // simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;

            System.out.println("Transaction successful: " +
                    customerName +
                    ", Amount: " + amount +
                    ", Balance: " + balance +
                    ", Time: " + java.time.LocalTime.now());
        } else {
            System.out.println("Transaction failed: " +
                    customerName +
                    ", Insufficient balance. Current Balance: " + balance);
        }
    }
}
