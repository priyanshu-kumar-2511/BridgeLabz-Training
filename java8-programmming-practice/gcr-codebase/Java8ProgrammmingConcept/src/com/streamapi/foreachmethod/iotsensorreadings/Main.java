package com.streamapi.foreachmethod.iotsensorreadings;

/*3. IoT Sensor Readings
○ Scenario: Print all readings above threshold.
○ Task: Use streams with forEach().*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> readings = Arrays.asList(22.5, 25.0, 30.2, 18.9, 35.4, 27.1);

        double threshold = 28.0;

        readings.stream().filter(reading -> reading > threshold)
                .forEach(reading ->System.out.println("High Reading: " + reading));
    }
}
