package com.multithreading.bankingsystem;

/*Problem 2: Banking System with Multiple Transactions
User Scenario:
A bank needs to process multiple ATM transactions concurrently. Multiple customers can
withdraw money from their accounts simultaneously, but the system must properly manage the

account balance.
Requirements:
● Create a BankAccount class with initial balance of 10,000
● Create a Transaction class that implements Runnable
● Multiple threads should attempt to withdraw different amounts
● Display transaction details: customer name, amount, timestamp, success/failure
● Show remaining balance after each successful transaction
Tasks:
1. Create 5 transaction threads with different withdrawal amounts: 3000, 4000, 2000, 5000,
1500
2. Each transaction should have a customer name
3. Implement proper thread naming
4. Display the state of each thread before processing
5. Note: This problem highlights the need for synchronization (students should observe race
conditions)
Expected Output Pattern:
[Customer-1] Attempting to withdraw 3000
[Customer-2] Attempting to withdraw 4000
Transaction successful: Customer-1, Amount: 3000, Balance: 7000
...*/

public class BankingSystem {

    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(new Transaction(account, "Customer-1", 3000), "ATM-1");
        Thread t2 = new Thread(new Transaction(account, "Customer-2", 4000), "ATM-2");
        Thread t3 = new Thread(new Transaction(account, "Customer-3", 2000), "ATM-3");
        Thread t4 = new Thread(new Transaction(account, "Customer-4", 5000), "ATM-4");
        Thread t5 = new Thread(new Transaction(account, "Customer-5", 1500), "ATM-5");

        System.out.println("Thread states before start:");
        System.out.println(t1.getName() + " → " + t1.getState());
        System.out.println(t2.getName() + " → " + t2.getState());
        System.out.println(t3.getName() + " → " + t3.getState());
        System.out.println(t4.getName() + " → " + t4.getState());
        System.out.println(t5.getName() + " → " + t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}
