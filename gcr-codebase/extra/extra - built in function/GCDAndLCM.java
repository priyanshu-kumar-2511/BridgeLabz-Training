import java.util.Scanner;

public class GCDAndLCM {

    // Method to calculate GCD using Euclidean Algorithm
    static int calculateGCD(int a, int b) {

        // Base case
        if (b == 0) {
            return a;
        }

        // Recursive call
        return calculateGCD(b, a % b);
    }

    // Method to calculate LCM using GCD
    static int calculateLCM(int a, int b) {

        // LCM formula: (a * b) / GCD(a, b)
        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        sc.close();
    }
}
