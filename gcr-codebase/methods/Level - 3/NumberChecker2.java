import java.util.Scanner;
import java.util.Arrays;

public class NumberChecker2 {

    // creating method to count digits
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;

        while (temp != 0) {
            count++;
            temp /= 10;
        }
        return count;
    }

    // creating method to store digits in array
    public static int[] getDigitsArray(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        int index = count - 1;
        int temp = number;

        while (temp != 0) {
            digits[index] = temp % 10;
            temp /= 10;
            index--;
        }
        return digits;
    }

    // creating method to find sum of digits
    public static int findSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // creating method to find sum of squares of digits
    public static double findSumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // creating method to check Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = findSumOfDigits(digits);
        return number % sum == 0;
    }

    // creatin method to find digit frequency using 2D array
    public static int[][] findDigitFrequency(int[] digits) {

        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }
        // Count frequency
        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt(); 

        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Digit Count: " + countDigits(number));
        System.out.println("Sum of Digits: " + findSumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + findSumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshadNumber(number, digits));

        System.out.println("\nDigit Frequency:");
        int[][] frequency = findDigitFrequency(digits);
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + " → " + frequency[i][1] + " time(s)");
            }
        }
    }
}
