package com.regex.validateusername;

/*1. Validate a Username
A valid username:
Can only contain letters (a-z, A-Z), numbers (0-9), and underscores (_)
Must start with a letter
Must be between 5 to 15 characters long
🔹 Example Inputs & Outputs
✅ "user_123" → Valid
❌ "123user" → Invalid (starts with a number)
❌ "us" → Invalid (too short)
*/
import java.util.Scanner;

public class ValidateUserName {

    public static boolean isValidUsername(String username) {

        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return username.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
