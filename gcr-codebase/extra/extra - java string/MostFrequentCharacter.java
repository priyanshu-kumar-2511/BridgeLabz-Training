import java.util.Scanner;
public class MostFrequentCharacter {

    public static char mostFrequentChar(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("String must not be empty");
        }

        int[] freq = new int[256]; 3
        int maxCount = 0;
        char result = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            freq[c]++;

            if (freq[c] > maxCount) {
                maxCount = freq[c];
                result = c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        char mostFrequent = mostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
}
