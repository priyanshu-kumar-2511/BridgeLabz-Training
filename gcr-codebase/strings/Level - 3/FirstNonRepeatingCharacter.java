import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Method: Find first non-repeating character
    public static char findFirstNonRepeatingChar(String text) {

        // Frequency array for all ASCII characters
        int[] freq = new int[256];

        // Step 1: Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 2: Find first character with frequency = 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("\nFirst non-repeating character: " + result);
        } else {
            System.out.println("\nNo non-repeating character found.");
        }

        sc.close();
    }
}
