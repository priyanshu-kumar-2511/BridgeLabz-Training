package com.streamapi.foreachmethod.stockpricelogger;

/*1. Stock Price Logger
○ Scenario: Display all stock prices from a live feed.
○ Task: Use forEach() to print updates.
*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
                152.35,
                153.10,
                151.90,
                154.25,
                155.00
        );

        stockPrices.forEach(System.out::println);
    }
}
