package eventmanager;

/*4. EventManager – Ticket Price Optimizer (Quick Sort)
Story: An event booking portal sorts millions of tickets by price before showing the top 50
cheapest or most expensive. Since speed is crucial and data is unsorted, Quick Sort is used for
its average-case performance.
Key Concepts:
● Fast average time
● Recursive partitioning
● Ideal for large, random datasets*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EventManager manager = new EventManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Event Manager =====");
            System.out.println("1. Add Ticket Price");
            System.out.println("2. Show Cheapest Tickets");
            System.out.println("3. Show Most Expensive Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter ticket price: ");
                    manager.addTicket(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("How many cheapest tickets? ");
                    manager.showCheapest(sc.nextInt());
                    break;

                case 3:
                    System.out.print("How many expensive tickets? ");
                    manager.showExpensive(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Event system closed");
                    return;
            }
        }
    }
}
