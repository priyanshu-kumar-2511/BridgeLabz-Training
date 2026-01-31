package com.functionalinterface.funtionalinterfaces.temperaturealertsystem;

/*1. Temperature Alert System
○ Scenario: Alert if temperature crosses threshold.
○ Task: Use Predicate<Double> functional interface.
*/
import java.util.function.Predicate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        double threshold = 37.5;

        // Predicate to check if temperature exceeds threshold
        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        System.out.println("Enter the current temperature: ");
        double currentTemp = sc.nextDouble();

        if (isHighTemperature.test(currentTemp)) {
            System.out.println("ALERT: Temperature is too high!");
        } else {
            System.out.println("Temperature is normal.");
        }
    }
}
