import java.util.Scanner;
public class NumberChecker4 {

    // creating method to check whether number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // creating method to check whether number is neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;

        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // creating method to check whether number is spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // creating method to check whether number is automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;

        while (temp != 0) {
            if (square % 10 != temp % 10) {
                return false;
            }
            square /= 10;
            temp /= 10;
        }
        return true;
    }

    // creating method to check whether number is buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); 

        System.out.println("Number: " + number);
        System.out.println("Is Prime Number: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeonNumber(number));
        System.out.println("Is Spy Number: " + isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(number));
        System.out.println("Is Buzz Number: " + isBuzzNumber(number));
    }
}
