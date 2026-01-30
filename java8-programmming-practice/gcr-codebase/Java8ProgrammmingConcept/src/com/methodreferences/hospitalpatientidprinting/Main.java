package com.methodreferences.hospitalpatientidprinting;

/*1. Hospital Patient ID Printing
○ Scenario: Need to print all patient IDs from a list for admin verification.
○ Task: Use method references instead of lambdas.
*/
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> patientIds = Arrays.asList(
                "P1001",
                "P1002",
                "P1003",
                "P1004"
        );

        // Using method reference
        patientIds.forEach(System.out::println);
    }
}
