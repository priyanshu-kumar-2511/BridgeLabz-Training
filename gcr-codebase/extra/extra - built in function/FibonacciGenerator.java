import java.util.Scanner;

public class FibonacciGenerator {

    // Method to generate and print Fibonacci sequence
    static void printFibonacci(int terms) {

        // If terms are less than or equal to 0
        if (terms <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        int a = 0, b = 1;

        // Print Fibonacci numbers
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");

            int next = a + b; // calculate next term
            a = b;
            b = next;
        }
        System.out.println(); // move to next line
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take number of terms from user
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        // Call Fibonacci method
        printFibonacci(terms);

        sc.close();
    }
}
