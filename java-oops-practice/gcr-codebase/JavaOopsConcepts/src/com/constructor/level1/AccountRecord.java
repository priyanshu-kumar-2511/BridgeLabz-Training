package com.constructor.level1;

public class AccountRecord {

    public String accountNumber;      // public
    protected String accountHolder;   // protected
    private double balance;           // private

    public AccountRecord(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }
}
