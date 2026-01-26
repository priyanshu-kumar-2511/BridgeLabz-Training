package com.regex.validatecreditcardnumber;

/*1️1. Validate a Credit Card Number (Visa, MasterCard, etc.)
A Visa card number starts with 4 and has 16 digits.
A MasterCard starts with 5 and has 16 digits.
*/
import java.util.Scanner;

public class CreditCardValidator {

    public static boolean isValidCard(String cardNumber) {

        String regex = "^(4\\d{15}|5\\d{15})$";
        return cardNumber.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter card number: ");
        String card = sc.nextLine();

        if (isValidCard(card)) {
            System.out.println("Valid card format");
        } else {
            System.out.println("Invalid card format");
        }

        sc.close();
    }
}
