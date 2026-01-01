/*
20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid.
*/

import java.util.Scanner;

public class FestivalLuckyDraw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {

            System.out.print("Visitor " + i + ", enter your lucky number: ");
            int number = sc.nextInt();

            // Invalid input check
            if (number <= 0) {
                System.out.println("Invalid number. Try next visitor.");
                continue;   // skip this visitor
            }

            // Lucky draw logic
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("🎁 Congratulations! You won a gift.");
            } else {
                System.out.println("Sorry, no gift this time.");
            }
        }

        sc.close();
    }
}
