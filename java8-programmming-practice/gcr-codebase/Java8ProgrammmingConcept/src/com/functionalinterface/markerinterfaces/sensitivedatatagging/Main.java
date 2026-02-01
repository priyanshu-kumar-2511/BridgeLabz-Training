package com.functionalinterface.markerinterfaces.sensitivedatatagging;

/*3. Sensitive Data Tagging
○ Scenario: Mark sensitive data classes for encryption.
○ Task: Create a custom marker interface.*/

public class Main {

    public static void main(String[] args) {

        CustomerAccount account = new CustomerAccount("ACC12345", 50000);

        ProductInfo product = new ProductInfo("Laptop");

        EncryptionService.process(account);
        EncryptionService.process(product);
    }
}
