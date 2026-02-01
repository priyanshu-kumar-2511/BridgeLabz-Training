package com.streamapi.stream.transformingnamesfordisplay;

/*5. Transforming Names for Display
Given a list of customer names, use .map() to convert them to uppercase and
.sorted() to display them alphabetically.*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<String> customers = Arrays.asList(
                "ravi",
                "anita",
                "Karan",
                "meera",
                "sachin"
        );

        List<String> formatted = customers.stream().map(String::toUpperCase).sorted().collect(Collectors.toList());

        formatted.forEach(System.out::println);
    }
}
