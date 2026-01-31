package com.functionalinterface.definingandimplementinginterfaces.digitalpaymentinterface;

/*3. Digital Payment Interface
○ Scenario: UPI, Credit Card, Wallet all must implement pay() method.
○ Task: Define and implement.*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<PaymentMethod> payments = Arrays.asList(
                new UPI("ravi@upi"),
                new CreditCard("1234567812345678"),
                new Wallet("WALLET123")
        );

        for (PaymentMethod method : payments) {
            System.out.println("Using: " + method.getPaymentDetails());
            method.pay(1500.00);
            System.out.println();
        }
    }
}
