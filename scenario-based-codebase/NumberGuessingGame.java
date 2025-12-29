/*
7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.
*/


import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;
        int guess;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("Guess the number between 1 and 100");
        System.out.println("You have 5 attempts only.");

        do {
            System.out.print("Enter your guess number: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too High!");
            }
            else if (guess < secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                guessedCorrectly = true;
                break;
            }

        } while (attempts < 5);

        if (!guessedCorrectly) {
            System.out.println("You lost! The correct number was: " + secretNumber);
        }

        sc.close();
    }
}
