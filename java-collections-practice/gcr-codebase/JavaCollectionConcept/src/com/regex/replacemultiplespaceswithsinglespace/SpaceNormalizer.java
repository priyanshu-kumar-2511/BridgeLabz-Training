package com.regex.replacemultiplespaceswithsinglespace;

/*8️. Replace Multiple Spaces with a Single Space
🔹 Example Input:
"This is an example with multiple spaces."
🔹 Expected Output:
"This is an example with multiple spaces."
*/
public class SpaceNormalizer {

    public static void main(String[] args) {

        String input = "This    is   an   example   with    multiple   spaces.";

        String output = input.replaceAll("\\s+", " ");

        System.out.println("Original:");
        System.out.println(input);

        System.out.println("\nAfter Normalization:");
        System.out.println(output);
    }
}
