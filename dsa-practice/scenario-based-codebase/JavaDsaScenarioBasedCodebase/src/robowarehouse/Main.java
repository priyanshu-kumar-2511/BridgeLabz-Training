package robowarehouse;

/*6. RoboWarehouse – Shelf Loading Robot (Insertion Sort)
Story: A robot loads packages onto shelves based on weight. It adds one package at a time
and must maintain an ascending order by weight for balance. Insertion Sort helps since new
items are inserted into the sorted list dynamically.
Key Concepts:
● Insertion into sorted lists
● Low memory footprint
● Ideal for streaming insertions*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RoboWarehouse shelf = new RoboWarehouse();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== RoboWarehouse Control =====");
            System.out.println("1. Load Package");
            System.out.println("2. View Shelf");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter package weight (kg): ");
                    int w = sc.nextInt();
                    shelf.addPackage(w);
                    break;

                case 2:
                    shelf.showShelf();
                    break;

                case 3:
                    System.out.println("Robot shutdown");
                    return;
            }
        }
    }
}
