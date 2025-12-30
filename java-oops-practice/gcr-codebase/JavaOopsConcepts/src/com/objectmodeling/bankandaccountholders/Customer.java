package com.objectmodeling.bankandaccountholders;

import java.util.ArrayList;
public class Customer {
	String customerName;
    ArrayList<Account> accountList;

    public Customer(String customerName) {
        this.customerName = customerName;
        accountList = new ArrayList<>();
    }

    // Bank will call this when opening account
    public void addAccount(Account account) {
        accountList.add(account);
    }

    // Customer can view balances of all accounts
    public void viewBalance() {
        System.out.println("\nBalances for " + customerName + ":");
        for (Account acc : accountList) {
            System.out.println("Account " + acc.accountNumber +
                    " at " + acc.bank.bankName +
                    " : ₹" + acc.getBalance());
        }
    }
}
