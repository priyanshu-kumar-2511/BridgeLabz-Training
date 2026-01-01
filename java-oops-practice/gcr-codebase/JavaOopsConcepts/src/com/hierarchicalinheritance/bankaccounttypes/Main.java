package com.hierarchicalinheritance.bankaccounttypes;

public class Main {
	public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SA101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA202", 30000, 10000);
        BankAccount a3 = new FixedDepositAccount("FD303", 100000, 12);

        a1.displayDetails();
        ((SavingsAccount)a1).displayAccountType();

        System.out.println();

        a2.displayDetails();
        ((CheckingAccount)a2).displayAccountType();

        System.out.println();

        a3.displayDetails();
        ((FixedDepositAccount)a3).displayAccountType();
    }
}
