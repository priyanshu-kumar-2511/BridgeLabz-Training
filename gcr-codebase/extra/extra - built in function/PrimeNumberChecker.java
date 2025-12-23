import java.util.Scanner;

public class PrimeNumberChecker {

    // Method to check whether a number is prime
    static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to sqrt(num)
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // divisible → not prime
            }
        }

        return true; // no divisors found → prime
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call prime check method
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number.");
        } else {
            System.out.println(number + " is NOT a Prime number.");
        }

        sc.close();
    }
}
