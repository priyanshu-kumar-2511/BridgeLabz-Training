package trafficmanager;

import java.util.Scanner;

/*7. TrafficManager – Roundabout Vehicle Flow (Circular Linked List +
Queue)
Story: A smart city roundabout allows vehicles to enter and exit dynamically. Each vehicle is a
node in a Circular Linked List. A Queue manages vehicles waiting to enter.
Requirements:
● Add or remove cars in a circular path.
● Queue overflow/underflow handling.
● Print state of roundabout at any time.*/

public class Main {
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Traffic Manager =====");
            System.out.println("1. Car arrives");
            System.out.println("2. Allow car into roundabout");
            System.out.println("3. Car exits");
            System.out.println("4. Show roundabout");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter car number: ");
                    tm.arrive(sc.nextLine());
                    break;
                case 2:
                    tm.allowEntry();
                    break;
                case 3:
                    System.out.print("Enter car number to exit: ");
                    tm.exit(sc.nextLine());
                    break;
                case 4:
                    tm.show();
                    break;
                case 5:
                    System.out.println("Traffic system closed");
                    return;
            }
        }
    }
}
