package com.encapsulationandpolymorphism.bankingsystem;

import java.util.*;

public class BankingSystemMain {
    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Priyanshu", 50000));
        accounts.add(new CurrentAccount("CA202", "TechWizard Pvt Ltd", 200000));

        for (BankAccount acc : accounts) {
            System.out.println("--------------------------------");
            System.out.println("Account No: " + acc.getAccountNumber());
            System.out.println("Holder: " + acc.getHolderName());
            System.out.println("Balance: " + acc.getBalance());

            System.out.println("Interest: " + acc.calculateInterest());

            Loanable loan = (Loanable) acc;
            System.out.println("Loan Eligibility: " + loan.calculateLoanEligibility());
            loan.applyForLoan(50000);
        }
    }
}
