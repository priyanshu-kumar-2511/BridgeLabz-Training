package com.functionalinterface.funtionalinterfaces.temperaturealertsystem;

/*1. Temperature Alert System
○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.
*/
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        double threshold = 37.5;

        // Predicate to check if temperature exceeds threshold
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        double currentTemp = 38.2;

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("ALERT: Temperature is too high!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
