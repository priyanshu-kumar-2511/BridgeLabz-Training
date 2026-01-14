package traincompanion;

import java.util.Scanner;

/*5. TrainCompanion – Compartment Navigation System (Doubly Linked
List)
Story: In a long-distance train app, passengers can walk to the next or previous compartment,
or search for services (like pantry, WiFi). Each compartment is a node in a Doubly Linked List.
Requirements:
● Traverse forward or backward.
● Insert/Remove compartments dynamically.
● Display adjacent compartments for quick decisions.*/

public class Main {
    public static void main(String[] args) {

        Train train = new Train();

        train.addCompartment("Coach A", "Seats");
        train.addCompartment("Coach B", "WiFi");
        train.addCompartment("Coach C", "Pantry");
        train.addCompartment("Coach D", "Sleeper");

        Scanner sc = new Scanner(System.in);

        train.showCurrent();

        while (true) {
            System.out.println("\n===== Train Companion =====");
            System.out.println("1. Move Forward");
            System.out.println("2. Move Backward");
            System.out.println("3. Remove Current Compartment");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    train.moveForward();
                    break;
                case 2:
                    train.moveBackward();
                    break;
                case 3:
                    train.removeCurrent();
                    train.showCurrent();
                    break;
                case 4:
                    System.out.println("Journey Ended");
                    return;
            }
        }
    }
}
