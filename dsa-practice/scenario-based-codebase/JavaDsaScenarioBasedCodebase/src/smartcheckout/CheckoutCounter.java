package smartcheckout;

import java.util.*;

public class CheckoutCounter {

    private Queue<Customer> queue = new LinkedList<>();
    private HashMap<String, Item> inventory = new HashMap<>();

    public CheckoutCounter() {
        inventory.put("Milk", new Item("Milk", 50, 10));
        inventory.put("Bread", new Item("Bread", 30, 10));
        inventory.put("Eggs", new Item("Eggs", 10, 20));
    }

    public void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println(c.name + " joined the queue");
    }

    // Safe access to queue
    public void addItemToCustomer(String customerName, String itemName) {
        for (Customer c : queue) {
            if (c.name.equals(customerName)) {
                c.addItem(itemName);
                System.out.println(itemName + " added to " + customerName + "'s cart");
                return;
            }
        }
        System.out.println("Customer not found in queue");
    }

    public void serveCustomer() {
        if (queue.isEmpty()) {
            System.out.println("No customers in queue");
            return;
        }

        Customer c = queue.poll();
        double total = 0;

        System.out.println("\nBilling for " + c.name);

        for (String itemName : c.cart) {
            Item item = inventory.get(itemName);

            if (item == null || item.stock == 0) {
                System.out.println(itemName + " out of stock");
                continue;
            }

            item.stock--;
            total += item.price;
            System.out.println(itemName + " - Rs" + item.price);
        }

        System.out.println("Total Bill = Rs" + total);
    }

    public void showStock() {
        System.out.println("\nStore Inventory:");
        for (Item i : inventory.values()) {
            System.out.println(i.name + " | Rs" + i.price + " | Stock: " + i.stock);
        }
    }
}
