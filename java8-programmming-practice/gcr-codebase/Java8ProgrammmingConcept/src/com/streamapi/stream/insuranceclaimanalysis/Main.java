package com.streamapi.stream.insuranceclaimanalysis;

/*3. Insurance Claim Analysis
○ Scenario: Find the average claim amount for each claim type.
○ Task: Use groupingBy() and averagingDouble().*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
                new Claim("Health", 10000),
                new Claim("Health", 15000),
                new Claim("Auto", 20000),
                new Claim("Auto", 18000),
                new Claim("Home", 50000),
                new Claim("Home", 45000)
        );

        Map<String, Double> averageByType = claims.stream().collect(Collectors.groupingBy( Claim::getClaimType, Collectors.averagingDouble(Claim::getAmount)));

        averageByType.forEach((type, avg) -> System.out.println(type + " Average: " + avg));
    }
}
