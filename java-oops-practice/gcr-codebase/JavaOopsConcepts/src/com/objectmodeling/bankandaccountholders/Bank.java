package com.objectmodeling.bankandaccountholders;

public class Bank {
	String bankName;
    static int nextAccountNumber = 1001;

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // This creates the association between Bank and Customer
    public Account openAccount(Customer customer) {

        Account newAccount = new Account(nextAccountNumber, this);
        nextAccountNumber++;

        customer.addAccount(newAccount);

        System.out.println("Account opened for " + customer.customerName +
                " at " + bankName +
                " | Account No: " + newAccount.accountNumber);

        return newAccount;
    }
}
