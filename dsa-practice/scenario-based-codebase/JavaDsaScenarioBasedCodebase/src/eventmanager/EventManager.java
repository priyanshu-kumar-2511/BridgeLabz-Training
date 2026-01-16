package eventmanager;

import java.util.*;

public class EventManager {

    private List<Ticket> tickets = new ArrayList<>();

    public void addTicket(double price) {
        tickets.add(new Ticket(price));
        System.out.println("Ticket added");
    }

    // Quick Sort entry
    public void sortTickets() {
        if (tickets.size() <= 1) return;
        quickSort(0, tickets.size() - 1);
        System.out.println("Tickets sorted using Quick Sort");
    }

    // Quick Sort (in-place)
    private void quickSort(int low, int high) {
        if (low < high) {
            int pivotIndex = partition(low, high);
            quickSort(low, pivotIndex - 1);
            quickSort(pivotIndex + 1, high);
        }
    }

    // Partition logic
    private int partition(int low, int high) {
        double pivot = tickets.get(high).price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets.get(j).price <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        Ticket temp = tickets.get(i);
        tickets.set(i, tickets.get(j));
        tickets.set(j, temp);
    }

    public void showCheapest(int k) {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available");
            return;
        }

        sortTickets();
        System.out.println("\nCheapest Tickets:");
        for (int i = 0; i < Math.min(k, tickets.size()); i++) {
            System.out.println("₹" + tickets.get(i).price);
        }
    }

    public void showExpensive(int k) {
        if (tickets.isEmpty()) {
            System.out.println("No tickets available");
            return;
        }

        sortTickets();
        System.out.println("\nMost Expensive Tickets:");
        for (int i = tickets.size() - 1; i >= Math.max(0, tickets.size() - k); i--) {
            System.out.println("₹" + tickets.get(i).price);
        }
    }
}
