package com.functionalinterface.staticmethodsininterfaces.passwordstrengthvalidator;

/*1. Password Strength Validator
○ Scenario: In an insurance portal, password policy rules are centrally defined.
○ Task: Create a static method in an interface SecurityUtils to check password
strength.
*/

import java.util.*;

public class Main {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("In password use Uppercase, Lowercase, Digit & Special characters");
    	System.out.print("Enter a password: ");
        String password = sc.next();

        System.out.println("Your Password is -> " + SecurityUtils.isStrongPassword(password));

    }
}
