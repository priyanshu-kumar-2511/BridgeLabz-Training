package com.streamapi.foreachmethod.eventattendeewelcomemessage;

/*2. Event Attendee Welcome Message
○ Scenario: Print a welcome message for all attendees.
○ Task: Use forEach() with a lambda.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
                "Ravi",
                "Anita",
                "Karan",
                "Meera"
        );

        attendees.forEach(name -> System.out.println("Welcome to the event, " + name + "!"));
    }
}
