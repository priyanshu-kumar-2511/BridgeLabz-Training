import java.util.Scanner;

public class IllegalArgument {

    // create method to generate IllegalArgumentException
    public static void generateException(String text) {
        // start index > end index → runtime exception
        System.out.println(text.substring(5, 2));
    }

    // create method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        } 
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught!");
            System.out.println("Reason: Start index is greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating IllegalArgumentException:");
        generateException(text);

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(text);

        sc.close();
    }
}
