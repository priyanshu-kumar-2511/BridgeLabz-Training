import java.util.Scanner;
import java.util.Arrays;

public class FactorsOfNumber {

    // creating method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {

        // first loop to count number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // creating array to store factors
        int[] factors = new int[count];

        // second loop to store factors in array
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // creating method to find greatest factor using factors array
    public static int findGreatestFactor(int[] factors) {
        int max = factors[0];

        for (int i = 1; i < factors.length; i++) {
            if (factors[i] > max) {
                max = factors[i];
            }
        }
        return max;
    }

    // creating method to find sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;

        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // creating method to find product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;

        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // creating method to find product of cube of factors
    public static double findProductOfCubeOfFactors(int[] factors) {
        double product = 1;

        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // main method to call all static methods and display results
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // getting factors array
        int[] factors = findFactors(number);

        System.out.println("Number: " + number);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cube of Factors: " + findProductOfCubeOfFactors(factors));
    }
}
