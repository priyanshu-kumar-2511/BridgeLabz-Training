import java.util.Scanner;

public class UniqueCharacters {

    // Method 1: Find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count++);
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method 2: Find unique characters using charAt()
    public static char[] findUniqueCharacters(String text) {
        int len = findLength(text);

        // Temporary array to store unique characters (max size = text length)
        char[] temp = new char[len];
        int uniqueCount = 0;

        // Outer loop: each character
        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            // Inner loop: check with previous characters
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // If unique, store it
            if (isUnique) {
                temp[uniqueCount++] = current;
            }
        }

        // Create exact-sized array for unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char[] uniqueChars = findUniqueCharacters(text);

        System.out.println("\nUnique characters:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }

        sc.close();
    }
}
