import java.util.Scanner;

public class CharacterFrequencyNestedLoops {

    // Method: Find frequency using nested loops
    public static String[] findFrequency(String text) {

        // Convert string to character array (as required)
        char[] chars = text.toCharArray();

        // Frequency array corresponding to each character
        int[] freq = new int[chars.length];

        // Step 1: Initialize frequency and use nested loops
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue; // already counted
            }

            freq[i] = 1; // initial count

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Step 3: Store result in 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyResult = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        for (String s : frequencyResult) {
            System.out.println(s);
        }
        sc.close();
    }
}
