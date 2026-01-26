package com.exceptions.uncheckedexception;

/*2. Unchecked Exception (Runtime Exception)
💡 Problem Statement:
Write a Java program that asks the user to enter two numbers and divides them. Handle possible exceptions such as:
ArithmeticException if division by zero occurs.
InputMismatchException if the user enters a non-numeric value.
Expected Behavior:
If the user enters valid numbers, print the result of the division.
If the user enters 0 as the denominator, catch and handle ArithmeticException.
If the user enters a non-numeric value, catch and handle InputMismatchException.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values.");

        } finally {
            sc.close();
        }
    }
}
