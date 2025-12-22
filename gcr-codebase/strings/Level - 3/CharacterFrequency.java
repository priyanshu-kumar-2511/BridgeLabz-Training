import java.util.Scanner;

public class CharacterFrequency {

    // Method: Find frequency of characters
    public static String[][] findCharacterFrequency(String text) {

        // Step 1: Frequency array for ASCII characters
        int[] freq = new int[256];

        // Step 2: Count frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Step 3: Count how many unique characters exist
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)]; // mark counted
            }
        }

        // Step 4: Create 2D array (Character + Frequency)
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] < 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(-freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = findCharacterFrequency(text);

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
