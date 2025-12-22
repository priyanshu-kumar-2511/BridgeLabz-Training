import java.util.Scanner;

public class SplitTextIntoWords {

    // create method to find string length
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
    // create method split text into words using charAt()
    public static String[] splitTextManually(String text) {

        int len = findLength(text), wc = 1;
        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ') wc++;

        int[] spaces = new int[wc - 1];
        for (int i = 0, j = 0; i < len; i++)
            if (text.charAt(i) == ' ') spaces[j++] = i;

        String[] words = new String[wc];
        for (int i = 0, s = 0; i < wc; i++) {
            int e = (i == wc - 1) ? len : spaces[i];
            words[i] = text.substring(s, e);
            s = e + 1;
        }
        return words;
    }
    // create method to convert words into 2D array (word + length)
    public static String[][] createWordLengthTable(String[] words) {

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = findLength(words[i]);
            table[i][0] = words[i];
            table[i][1] = String.valueOf(len);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitTextManually(text);
        String[][] result = createWordLengthTable(words);

        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
        sc.close();
    }
}