package com.lambdaexpressions.notificationfiltering;

/*3. Notification Filtering
○ Scenario: A hospital app sends patient alerts. Based on user preference, only
certain alerts should be shown.
○ Task: Use lambdas with Predicate to filter alerts.
*/

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
                new Alert("Ravi", "CRITICAL", 9),
                new Alert("Anita", "WARNING", 6),
                new Alert("Kiran", "INFO", 3),
                new Alert("Meera", "CRITICAL", 10),
                new Alert("Raj", "WARNING", 4)
        );

        // Only CRITICAL alerts
        Predicate<Alert> criticalOnly = alert -> alert.getType().equals("CRITICAL");

        List<Alert> criticalAlerts = alerts.stream().filter(criticalOnly).collect(Collectors.toList());

        System.out.println("Critical Alerts:");
        criticalAlerts.forEach(System.out::println);

        // Severity above 5
        Predicate<Alert> highSeverity = alert -> alert.getSeverity() > 5;

        List<Alert> severeAlerts = alerts.stream().filter(highSeverity).collect(Collectors.toList());

        System.out.println("\nHigh Severity Alerts:");
        severeAlerts.forEach(System.out::println);

        // Combine filters (CRITICAL and severity > 8)
        Predicate<Alert> combined = criticalOnly.and(alert -> alert.getSeverity() > 8);

        List<Alert> filtered = alerts.stream().filter(combined).collect(Collectors.toList());

        System.out.println("\nCritical & Very Severe Alerts:");
        filtered.forEach(System.out::println);
    }
}
