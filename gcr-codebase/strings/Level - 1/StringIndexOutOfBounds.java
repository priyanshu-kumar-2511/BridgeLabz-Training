import java.util.Scanner;
public class StringIndexOutOfBounds{

    // Create method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println("Character at invalid index: " + str.charAt(str.length()));
    }

    // Create method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Character at invalid index: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        System.out.println("\nGenerating Exception:");
        generateException(text);   

        System.out.println("\nHandling Exception:");
        handleException(text);

        input.close();
    }
}