package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class CustomerAccount implements SensitiveData {

    private String accountNumber;
    private double balance;

    public CustomerAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CustomerAccount{accountNumber='" + accountNumber + "', balance=" + balance + "}";
    }
}
