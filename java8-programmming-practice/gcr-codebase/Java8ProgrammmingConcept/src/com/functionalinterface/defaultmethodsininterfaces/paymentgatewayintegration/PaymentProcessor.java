package com.functionalinterface.defaultmethodsininterfaces.paymentgatewayintegration;

public interface PaymentProcessor {

    void pay(double amount);

    // New method added later
    default void refund(double amount) {
        System.out.println("Refund not supported by this provider.");
    }
}
