import java.util.Scanner;

public class RemoveDuplicates {

    public static String removeDuplicates(String text) {
        if (text == null) return null;

        boolean[] seen = new boolean[256]; // ASCII assumption
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("After removing duplicates: " + removeDuplicates(input));

        sc.close();
    }
}
