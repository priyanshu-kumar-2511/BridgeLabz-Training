package com.encapsulationandpolymorphism.bankingsystem;

public class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate = 0.04;   // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan Applied: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 3;   // 3x of balance
    }
}
