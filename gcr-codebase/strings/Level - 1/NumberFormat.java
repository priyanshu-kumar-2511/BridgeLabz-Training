import java.util.Scanner;
public class NumberFormat {

    // create method to generate NumberFormatException
    public static void generateException(String text) {

        int number = Integer.parseInt(text);
        System.out.println("Number is: " + number);
    }

    // create method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught!");
            System.out.println("Reason: Input text does not contain a valid number.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value: ");
        String text = sc.next();

        System.out.println("\nGenerating NumberFormatException:");
        generateException(text);

        System.out.println("\nHandling NumberFormatException:");
        handleException(text);

        sc.close();
    }
}
