package com.encapsulationandpolymorphism.bankingsystem;

public abstract class BankAccount {
    private String accountNumber;     // encapsulated
    private String holderName;
    protected double balance;         // child classes need it

    public BankAccount(String accNo, String name, double balance) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = balance;
    }

    // Controlled access
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Common behavior
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("❌ Insufficient Balance");
    }

    // Abstract method
    public abstract double calculateInterest();
}

