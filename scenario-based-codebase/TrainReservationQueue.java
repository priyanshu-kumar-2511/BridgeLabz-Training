/*
12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).
*/
import java.util.Scanner;

public class TrainReservationQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSeats = 10;
        int availableSeats = totalSeats;

        while (true) {

            System.out.println("\n====================================");
            System.out.println("      TRAIN TICKET BOOKING SYSTEM");
            System.out.println("====================================");
            System.out.println("Total Seats      : " + totalSeats);
            System.out.println("Available Seats : " + availableSeats);
            System.out.println("------------------------------------");
            System.out.println("1. Book Ticket");
            System.out.println("2. Exit");
            System.out.println("====================================");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (availableSeats == 0) {
                        System.out.println("\n------------------------------------");
                        System.out.println("Sorry! No seats left. Train is full.");
                        System.out.println("------------------------------------\n");
						System.out.println("************************************");
                        break;
                    }

                    System.out.print("How many tickets you want to book? ");
                    int tickets = sc.nextInt();

                    if (tickets <= 0) {
                        System.out.println("Invalid number of tickets.");
                    }
                    else if (tickets > availableSeats) {
                        System.out.println("Only " + availableSeats + " seats are available.");
                    }
                    else {
                        availableSeats = availableSeats - tickets;
                        System.out.println("------------------------------------");
                        System.out.println(tickets + " ticket(s) booked successfully.");
                        System.out.println("------------------------------------\n");
						System.out.println("************************************");
                    }
                    break;

                case 2:
                    System.out.println("\n====================================");
                    System.out.println("Thank you for using train booking system.");
                    System.out.println("====================================\n");
					System.out.println("************************************");
                    return;

                default:
                    System.out.println("Wrong choice. Try again.");
            }

            // When seats become zero, stop the system
            if (availableSeats == 0) {
                System.out.println("\n====================================");
                System.out.println("All seats booked. Booking closed.");
                System.out.println("======================================");
                break;
            }
        }
    }
}
