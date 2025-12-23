import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    // Method to generate a guess between low and high
    static int generateGuess(int low, int high, Random random) {
        return random.nextInt(high - low + 1) + low;
    }

    // Method to take feedback from user
    static String getFeedback(Scanner sc) {
        System.out.print("Enter feedback (high / low / correct): ");
        return sc.nextLine().toLowerCase();
    }

    // Method to update range based on feedback
    static void updateRange(String feedback, int guess, int[] range) {
        if (feedback.equals("high")) {
            range[1] = guess - 1; // decrease upper limit
        } else if (feedback.equals("low")) {
            range[0] = guess + 1; // increase lower limit
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // range[0] = low, range[1] = high
        int[] range = {1, 100};

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will guess it.");
        System.out.println("Reply with: high, low, or correct");

        while (true) {

            // Computer guess
            int guess = generateGuess(range[0], range[1], random);
            System.out.println("\nMy guess: " + guess);

            // User feedback
            String feedback = getFeedback(sc);

            if (feedback.equals("correct")) {
                System.out.println("🎯 Correct! I guessed your number.");
                break;
            } 
            else if (feedback.equals("high") || feedback.equals("low")) {
                // Update guessing range
                updateRange(feedback, guess, range);
            } 
            else {
                System.out.println("Invalid input. Please type high, low, or correct.");
            }
        }

        sc.close();
    }
}
