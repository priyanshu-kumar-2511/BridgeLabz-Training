package smartcheckout;

/*9. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CheckoutCounter counter = new CheckoutCounter();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Smart Checkout =====");
            System.out.println("1. New Customer");
            System.out.println("2. Add Item to Customer");
            System.out.println("3. Serve Customer");
            System.out.println("4. View Stock");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter customer name: ");
                    counter.addCustomer(new Customer(sc.nextLine()));
                    break;

                case 2:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter item name: ");
                    String item = sc.nextLine();
                    counter.addItemToCustomer(name, item);
                    break;

                case 3:
                    counter.serveCustomer();
                    break;

                case 4:
                    counter.showStock();
                    break;

                case 5:
                    System.out.println("Supermarket closed");
                    return;
            }
        }
    }
}
