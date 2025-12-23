import java.util.Scanner;

public class PalindromeChecker {

    // Method to take input string from user
    static String takeInput(Scanner sc) {
        System.out.print("Enter a string: ");
        return sc.nextLine();
    }

    // Method to check if the string is a palindrome
    static boolean isPalindrome(String text) {

        // Convert to lowercase to ignore case differences
        text = text.toLowerCase();

        int start = 0;
        int end = text.length() - 1;

        // Compare characters from both ends
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false; // mismatch found
            }
            start++;
            end--;
        }
        return true; // palindrome
    }

    // Method to display result
    static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = takeInput(sc);

        boolean result = isPalindrome(input);

        displayResult(input, result);

        sc.close();
    }
}
