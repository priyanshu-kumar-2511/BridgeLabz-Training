package com.functionalinterface.definingandimplementinginterfaces.digitalpaymentinterface;

public class UPI implements PaymentMethod {

    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount + " using UPI ID: " + upiId);
    }

    @Override
    public String getPaymentDetails() {
        return "UPI (" + upiId + ")";
    }
}
