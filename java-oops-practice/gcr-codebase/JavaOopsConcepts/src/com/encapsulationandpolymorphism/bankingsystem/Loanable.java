package com.encapsulationandpolymorphism.bankingsystem;

public interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}
