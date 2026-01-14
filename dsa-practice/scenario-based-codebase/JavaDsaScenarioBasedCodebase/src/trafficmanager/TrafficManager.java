package trafficmanager;

import java.util.*;

public class TrafficManager {

    private Car head = null;             
    private Queue<Car> waitingQueue = new LinkedList<>();
    private final int MAX_ROUNDABOUT = 5;  // capacity

    // Add car to waiting queue
    public void arrive(String number) {
        waitingQueue.offer(new Car(number));
        System.out.println("Car " + number + " waiting to enter");
    }

    // Move car from queue to roundabout
    public void allowEntry() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue empty – no cars waiting");
            return;
        }

        if (getCount() == MAX_ROUNDABOUT) {
            System.out.println("Roundabout full");
            return;
        }

        Car car = waitingQueue.poll();
        insertIntoCircle(car);
        System.out.println("Car " + car.number + " entered roundabout");
    }

    // Remove a car from roundabout
    public void exit(String number) {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        Car curr = head;
        Car prev = null;

        do {
            if (curr.number.equals(number)) {
                if (prev != null)
                    prev.next = curr.next;
                else {
                    // removing head
                    Car tail = head;
                    while (tail.next != head)
                        tail = tail.next;
                    head = curr.next;
                    tail.next = head;
                }
                System.out.println("Car " + number + " exited");
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Car not found in roundabout");
    }

    // Insert into circular linked list
    private void insertIntoCircle(Car car) {
        if (head == null) {
            head = car;
            car.next = head;
            return;
        }

        Car temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = car;
        car.next = head;
    }

    // Count cars in roundabout
    private int getCount() {
        if (head == null) return 0;
        int count = 1;
        Car temp = head.next;
        while (temp != head) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Print roundabout state
    public void show() {
        if (head == null) {
            System.out.println("Roundabout empty");
            return;
        }

        System.out.print("Roundabout: ");
        Car temp = head;
        do {
            System.out.print(temp.number + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}
