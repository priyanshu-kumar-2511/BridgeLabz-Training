package com.streamapi.foreachmethod.loggingtransactions;

/*5. Logging Transactions
Given a list of transaction IDs, use forEach() to log each transaction to the console with a
timestamp.
transactionIds.forEach(id -> System.out.println(LocalDateTime.now() + " -
Transaction: " + id));
*/

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList(
                "TXN1001",
                "TXN1002",
                "TXN1003"
        );
        transactionIds.forEach(id ->System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
