import java.util.Scanner;

public class ArrayIndexOutOfBounds {

    // create method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        // Accessing index greater than array length
        System.out.println(names[names.length]); 
    }

    // create method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            System.out.println(names[names.length]); 
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
            System.out.println("Reason: Accessing index beyond array size.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        generateException(names);

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names);

        sc.close();
    }
}
