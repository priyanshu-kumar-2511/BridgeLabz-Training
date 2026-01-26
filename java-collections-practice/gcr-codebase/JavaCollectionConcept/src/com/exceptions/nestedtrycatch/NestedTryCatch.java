package com.exceptions.nestedtrycatch;

/*9. Nested try-catch Block
💡 Problem Statement:
Write a Java program that:
Takes an array and a divisor as input.
Tries to access an element at an index.
Tries to divide that element by the divisor.
Uses nested try-catch to handle:
ArrayIndexOutOfBoundsException if the index is invalid.
ArithmeticException if the divisor is zero.
Expected Behavior:
If valid, print the division result.
If the index is invalid, catch and display "Invalid array index!".
If division by zero, catch and display "Cannot divide by zero!".*/

import java.util.Scanner;

public class NestedTryCatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};

        try {

            System.out.print("Enter index: ");
            int index = sc.nextInt();

            int value = array[index];   // May throw ArrayIndexOutOfBoundsException

            try {
                System.out.print("Enter divisor: ");
                int divisor = sc.nextInt();

                int result = value / divisor;  // May throw ArithmeticException

                System.out.println("Result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index!");
        }

        sc.close();
    }
}
