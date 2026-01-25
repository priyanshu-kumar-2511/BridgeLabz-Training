package com.collections.bankingsystem;

/*Implement a Banking System
Description:
HashMap stores customer accounts (AccountNumber -> Balance).
TreeMap sorts customers by balance.
Queue processes withdrawal requests.*/

public class Main {

    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        bank.createAccount("A101", 5000);
        bank.createAccount("A102", 2000);
        bank.createAccount("A103", 8000);

        bank.deposit("A102", 1000);

        bank.requestWithdrawal("A101", 1000);
        bank.requestWithdrawal("A102", 5000);  // insufficient
        bank.requestWithdrawal("A103", 2000);

        bank.processWithdrawals();

        System.out.println();
        bank.displayAllAccounts();

        System.out.println();
        bank.displaySortedByBalance();
    }
}
