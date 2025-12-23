import java.util.Scanner;

public class MaximumOfThree {

    // Method to take integer input from user
    static int takeInput(Scanner sc, String message) {
        System.out.print(message);
        return sc.nextInt();
    }

    // Method to find maximum of three numbers
    static int findMaximum(int a, int b, int c) {
        int max = a;        // assume first number is maximum

        if (b > max) {
            max = b;        // update if second number is bigger
        }

        if (c > max) {
            max = c;        // update if third number is bigger
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking inputs
        int num1 = takeInput(sc, "Enter first number: ");
        int num2 = takeInput(sc, "Enter second number: ");
        int num3 = takeInput(sc, "Enter third number: ");

        // Finding maximum
        int max = findMaximum(num1, num2, num3);

        // Display result
        System.out.println("Maximum of the three numbers is: " + max);

        sc.close();
    }
}
