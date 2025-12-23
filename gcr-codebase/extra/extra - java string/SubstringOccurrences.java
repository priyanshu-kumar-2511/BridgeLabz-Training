import java.util.Scanner;
public class SubstringOccurrences {

    public static int countOccurrences(String text, String pattern) {
        if (text == null || pattern == null || pattern.length() == 0) {
            return 0;
        }

        int count = 0;
        int index = 0;

        while ((index = text.indexOf(pattern, index)) != -1) {
            count++;
            index++; 
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String text = sc.nextLine();

        System.out.print("Enter substring: ");
        String pattern = sc.nextLine();

        int result = countOccurrences(text, pattern);
        System.out.println("Occurrences: " + result);

        sc.close();
    }
}
