package com.methodreferences.nameuppercasing;

/*2. Name Uppercasing
○ Scenario: Convert all employee names in uppercase for an HR letter.
○ Task: Use String::toUpperCase in a stream.
*/
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> employeeNames = Arrays.asList(
                "Ravi",
                "Anita",
                "Kiran",
                "Meera"
        );

        List<String> upperCaseNames = employeeNames.stream().map(String::toUpperCase).collect(Collectors.toList());

        upperCaseNames.forEach(System.out::println);
    }
}
