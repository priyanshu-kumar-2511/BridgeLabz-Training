import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static String removeCharacter(String text, char removeChar) {
        if (text == null) return null;

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != removeChar) {
                result.append(text.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char ch = sc.next().charAt(0);

        String modified = removeCharacter(input, ch);
        System.out.println("Modified String: \"" + modified + "\"");

        sc.close();
    }
}
