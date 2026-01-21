package tailorshop;

/*9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting*/

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Shop> orders = new ArrayList<>();

        System.out.print("Enter number of orders: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 1; i <= n; i++) {

            System.out.println("\nOrder " + i);

            System.out.print("Enter Order ID: ");
            String orderId = scanner.nextLine();

            System.out.print("Enter delivery deadline (YYYY-MM-DD): ");
            LocalDate deadline = LocalDate.parse(scanner.nextLine());

            orders.add(new Shop(orderId, deadline));
        }

        InsertionSort.sort(orders);

        System.out.println("\nOrders Sorted by Delivery Deadline:");
        for (Shop order : orders) {
            System.out.println(order);
        }

    }
}
