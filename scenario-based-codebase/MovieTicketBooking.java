/*
14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.
*/

import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========================================");
            System.out.println("    WELCOME TO MOVIE BOOKING SYSTEM    ");
            System.out.println("========================================");

            System.out.println("Select Movie Type:");
            System.out.println("1. Action");
            System.out.println("2. Comedy");
            System.out.println("3. Drama");
			System.out.println("4. Romantic");
            System.out.print("Enter your choice: ");
            int movieChoice = sc.nextInt();

            int moviePrice = 0;
            String movieName = "";

            switch (movieChoice) {
                case 1:
                    movieName = "Action";
                    moviePrice = 250;
                    break;
                case 2:
                    movieName = "Comedy";
                    moviePrice = 150;
                    break;
                case 3:
                    movieName = "Drama";
                    moviePrice = 180;
                    break;
				case 4:
                    movieName = "Romantic";
                    moviePrice = 200;					
                default:
                    System.out.println("Invalid movie type.");
                    continue;
            }

            System.out.println("\nSelect Seat Type:");
			System.out.println("1. Platinum (+150)");
            System.out.println("2. Gold (+100)");
            System.out.println("3. Silver (+50)");
            System.out.print("Enter your choice: ");
            int seatChoice = sc.nextInt();

            int seatPrice = 0;
            String seatType = "";

            if (seatChoice == 1) {
                seatType = "Platinum";
                seatPrice = 150;
            } else if (seatChoice == 2) {
                seatType = "Gold";
                seatPrice = 100;
            } else if (seatChoice == 3) {
                seatType = "Silver";
                seatPrice = 50;				
			} else {
                System.out.println("Invalid seat type.");
                continue;
            }

            System.out.println("\nDo you want snacks?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            System.out.print("Enter choice: ");
            int snackOption = sc.nextInt();

            int snackPrice = 0;
			String snackName = "";
			if(snackOption == 1){
				System.out.println("Select Snack Type:");
                System.out.println("1. Samosa (+50)");
                System.out.println("2. Popcorn (+110)");
                System.out.println("3. Coffee (+80)");
			    System.out.println("4. Cold Drink (+100)");
                System.out.print("Enter your choice: ");
				
				int snackChoice = sc.nextInt();
				System.out.println("");
				
                switch (snackChoice) {
                    case 1:
                        snackName = "Samosa";
                        snackPrice = 50;
                        break;
                    case 2:
                        snackName = "Popcorn";
                        snackPrice = 110;
                        break;
                    case 3:
                        snackName = "Coffee";
                        snackPrice = 80;
                        break;
				    case 4:
                        snackName = "Cold Drink";
                        snackPrice = 100;					
                    default:
                        System.out.println("Invalid sanck type.");
                    continue;
                }
			}   else {
                    snackPrice = 0;
			}		

            int totalBill = moviePrice + seatPrice + snackPrice;

            System.out.println("\n========================================");
            System.out.println("          BOOKING SUMMARY");
            System.out.println("========================================");
            System.out.println("Movie Type  : " + movieName);
            System.out.println("Seat Type   : " + seatType);
            System.out.println("Snacks      : " + snackName);
            System.out.println("----------------------------------------");
            System.out.println("Total Bill  : Rs " + totalBill);
            System.out.println("========================================\n");

            System.out.print("\nDo you want to book another ticket? (1 = Yes, 2 = No): ");
            int again = sc.nextInt();

            if (again != 1) {
                System.out.println("\nThank you for using Movie Booking System.");
                break;
            }
        }
    }
}
