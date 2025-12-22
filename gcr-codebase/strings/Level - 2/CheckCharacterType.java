import java.util.Scanner;

public class CheckCharacterType {

    // create method to Check character type
    public static String checkCharacterType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if character is a letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // create method to convert words into 2D array (Character + Type)
    public static String[][] analyzeText(String text) {
        int len = text.length();
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;
    }
	
    public static void displayResult(String[][] data) {

        System.out.println("\nCharacter\tType");
        System.out.println("---------\t----");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] analysis = analyzeText(text);
        displayResult(analysis);

        sc.close();
    }
}
