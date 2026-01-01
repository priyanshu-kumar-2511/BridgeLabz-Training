/*
19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation.
*/


import java.util.Scanner;
public class BusRouteDistanceTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalDistance = 0;
        int stop = 1;

        while (true) {
            System.out.print("Enter distance traveled to Stop " + stop + " (in km): ");
            double distance = sc.nextDouble();
            totalDistance += distance;

            System.out.println("Total distance so far: " + totalDistance + " km");

            System.out.print("Do you want to get off at this stop? (yes/no): ");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;   // passenger gets off
            }

            stop++;
        }

        System.out.println("\nPassenger got off.");
        System.out.println("Total distance traveled: " + totalDistance + " km");
        sc.close();
    }
}
