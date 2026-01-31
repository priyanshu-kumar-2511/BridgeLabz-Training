package com.functionalinterface.defaultmethodsininterfaces.paymentgatewayintegration;

public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Credit Card payment of ₹" + amount + " processed.");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " processed via Credit Card.");
    }
}
