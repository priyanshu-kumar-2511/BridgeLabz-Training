package com.functionalinterface.definingandimplementinginterfaces.digitalpaymentinterface;

public interface PaymentMethod {

    void pay(double amount);

    String getPaymentDetails();
}