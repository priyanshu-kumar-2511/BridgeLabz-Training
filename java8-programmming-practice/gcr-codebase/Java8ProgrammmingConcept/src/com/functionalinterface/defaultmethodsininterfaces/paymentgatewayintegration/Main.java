package com.functionalinterface.defaultmethodsininterfaces.paymentgatewayintegration;

/*1. Payment Gateway Integration
○ Scenario: Multiple payment providers integrate with your app. A new refund
method needs to be added without breaking old providers.
○ Task: Add a default refund() method in the PaymentProcessor interface.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<PaymentProcessor> processors = Arrays.asList(
                new UpiProcessor(),
                new CreditCardProcessor()
        );

        for (PaymentProcessor processor : processors) {
            processor.pay(1000);
            processor.refund(500);
            System.out.println();
        }
    }
}
