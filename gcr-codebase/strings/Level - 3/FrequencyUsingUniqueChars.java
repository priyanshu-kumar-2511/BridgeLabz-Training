import java.util.Scanner;

public class FrequencyUsingUniqueChars {

    // Method 1: Find unique characters using charAt() and nested loops
    public static char[] findUniqueCharacters(String text) {

        int len = text.length();
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[count++] = current;
            }
        }

        // Create exact-sized array
        char[] uniqueChars = new char[count];
        for (int i = 0; i < count; i++) {
            uniqueChars[i] = temp[i];
        }

        return uniqueChars;
    }

    // Method 2: Find frequency using unique characters
    public static String[][] findFrequency(String text) {

        // ASCII frequency array
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Get unique characters
        char[] uniqueChars = findUniqueCharacters(text);

        // Create 2D array (Character + Frequency)
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = findFrequency(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("---------\t---------");

        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(
                frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]
            );
        }
        sc.close();
    }
}
