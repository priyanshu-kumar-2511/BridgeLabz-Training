package com.methodreferences.invoiceobjectcreation;

/*3. Invoice Object Creation
○ Scenario: Generate invoice objects from transaction IDs.
○ Task: Use a constructor reference.
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "TXN1001",
                "TXN1002",
                "TXN1003"
        );

        // Using constructor reference
        List<Invoice> invoices = transactionIds.stream().map(Invoice::new).collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
