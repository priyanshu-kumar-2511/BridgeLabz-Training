import java.util.Scanner;
public class NumberChecker5 {

    // creating method to check whether number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    // creating method to check whether number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum > number;
    }

    // creating method to check whether number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = 0;

        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum < number;
    }

    // creating method to find factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;

        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // creating method to check whether number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        System.out.println("Number: " + number);
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }
}
