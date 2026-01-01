package com.hierarchicalinheritance.bankaccounttypes;

public class FixedDepositAccount extends BankAccount {
    int lockPeriod;   // in months

    FixedDepositAccount(String accountNumber, double balance, int lockPeriod) {
        super(accountNumber, balance);
        this.lockPeriod = lockPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }
}