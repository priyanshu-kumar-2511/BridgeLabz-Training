package com.functionalinterface.staticmethodsininterfaces.dateformatutility;

/*3. Date Format Utility
○ Scenario: An invoice generator must format dates in multiple formats.
○ Task: Use a static interface method to format dates.
*/
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println("Invoice Format: " + DateUtils.formatAsInvoice(today));

        System.out.println("US Format: " + DateUtils.formatAsUS(today));

        System.out.println("ISO Format: " + DateUtils.formatAsISO(today));

        // Custom pattern
        System.out.println("Custom Format: " + DateUtils.formatDate(today, "dd MMM yyyy"));
    }
}
