import java.util.Scanner;
public class LongestWord {

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        String longest = words[0];

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String longestWord = findLongestWord(input);

        if (longestWord.isEmpty()) {
            System.out.println("No valid word found.");
        } else {
            System.out.println("Longest word: " + longestWord);
        }
        sc.close();
    }
}
