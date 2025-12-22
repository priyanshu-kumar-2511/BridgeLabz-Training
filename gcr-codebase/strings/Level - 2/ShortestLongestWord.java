import java.util.Scanner;
public class ShortestLongestWord {

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
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    // create method to find shortest & longest word indexes
    public static int[] findShortestAndLongest(String[][] table) {
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = minLen;

        for (int i = 1; i < table.length; i++) {
            int currLen = Integer.parseInt(table[i][1]);

            if (currLen < minLen) {
                minLen = currLen;
                minIndex = i;
            }
            if (currLen > maxLen) {
                maxLen = currLen;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = splitTextManually(text);
        String[][] table = createWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("\nWord\tLength");
        System.out.println("----\t------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);

        sc.close();
    }
}
