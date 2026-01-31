package com.functionalinterface.definingandimplementinginterfaces.digitalpaymentinterface;

public class Wallet implements PaymentMethod {

    private String walletId;

    public Wallet(String walletId) {
        this.walletId = walletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Wallet payment of ₹" + amount +" using Wallet ID: " + walletId);
    }

    @Override
    public String getPaymentDetails() {
        return "Wallet (" + walletId + ")";
    }
}
