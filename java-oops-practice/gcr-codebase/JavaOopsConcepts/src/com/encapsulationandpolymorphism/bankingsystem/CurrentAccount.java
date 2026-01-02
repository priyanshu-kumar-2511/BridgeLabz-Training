package com.encapsulationandpolymorphism.bankingsystem;

public class CurrentAccount extends BankAccount implements Loanable {

    private double interestRate = 0.02;   // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;   // businesses get higher loan
    }
}
