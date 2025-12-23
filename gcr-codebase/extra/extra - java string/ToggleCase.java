import java.util.Scanner;
public class ToggleCase {

    public static String toggleCase(String text) {
        if (text == null) return null;

        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c >= 'A' && c <= 'Z') {
                chars[i] = (char) (c + 32); 
            } else if (c >= 'a' && c <= 'z') {
                chars[i] = (char) (c - 32); 
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = sc.nextLine();

        System.out.println("After toggling case: " + toggleCase(input));

        sc.close();
    }
}
