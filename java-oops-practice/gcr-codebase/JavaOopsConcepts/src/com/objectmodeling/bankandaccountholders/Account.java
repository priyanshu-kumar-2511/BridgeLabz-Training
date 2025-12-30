package com.objectmodeling.bankandaccountholders;

public class Account {
	int accountNumber;
    double balance;
    Bank bank;   // which bank this account belongs to

    public Account(int accountNumber, Bank bank) {
        this.accountNumber = accountNumber;
        this.bank = bank;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
