package parceltracker;

/*10. ParcelTracker – Delivery Chain Management (Singly Linked List)
Story: A courier company tracks parcels through stages like Packed → Shipped → In Transit →
Delivered. Each stage is a node in a Singly Linked List.
Requirements:
● Forward tracking through stages.
● Add custom intermediate checkpoints.
● Handle lost/missing parcels (null pointers).*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ParcelRoute route = new ParcelRoute();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Parcel Tracker =====");
            System.out.println("1. Track Parcel");
            System.out.println("2. Add Checkpoint");
            System.out.println("3. Mark Parcel Lost");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    route.track();
                    break;

                case 2:
                    System.out.print("Insert after stage: ");
                    String after = sc.nextLine();
                    System.out.print("New checkpoint name: ");
                    String name = sc.nextLine();
                    route.addCheckpoint(after, name);
                    break;

                case 3:
                    route.markLost();
                    break;

                case 4:
                    System.out.println("System closed");
                    return;
            }
        }
    }
}

