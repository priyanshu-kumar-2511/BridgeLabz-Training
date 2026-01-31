package com.functionalinterface.defaultmethodsininterfaces.paymentgatewayintegration;

public class UpiProcessor implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment of ₹" + amount + " processed.");
    }
}
