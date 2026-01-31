package com.functionalinterface.definingandimplementinginterfaces.digitalpaymentinterface;

public class CreditCard implements PaymentMethod {

    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit Card payment of ₹" + amount + " using Card: " + maskCard());
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card (" + maskCard() + ")";
    }

    private String maskCard() {
        return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
    }
}
