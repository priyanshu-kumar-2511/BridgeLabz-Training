package com.functionalinterface.funtionalinterfaces.stringlengthchecker;

/*2. String Length Checker
○ Scenario: Check if a message exceeds character limit.
○ Task: Use Function<String, Integer>.
*/
import java.util.function.Function;
import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Enter a message: ");
        String message = sc.nextLine();

        int limit = 20;

        // Function to calculate string length
        Function<String, Integer> lengthFunction = String::length;

        int length = lengthFunction.apply(message);

        if (length > limit) {
            System.out.println("Message exceeds character limit!");
        } else {
            System.out.println("Message is within limit.");
        }

        System.out.println("Message Length: " + length);
    }
}
