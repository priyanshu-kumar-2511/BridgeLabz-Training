import java.util.Scanner;
public class CovertTextToUppercase{
    // create method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUppercaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result = result + ch;
        }
        return result;
    }

    // create method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = input.nextLine();

        String manualUppercase = convertToUppercaseUsingCharAt(text);

        String builtInUppercase = text.toUpperCase();

        boolean result = compareStringsUsingCharAt(manualUppercase, builtInUppercase);

        System.out.println("\nUppercase using charAt(): " + manualUppercase);
        System.out.println("Uppercase using toUpperCase(): " + builtInUppercase);
        System.out.println("Are both results equal? " + result);

        input.close();
    }
}
  