package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketList {

    private Ticket head = null;
    private Ticket tail = null;

    // Add Ticket
    public void addTicket(int id, String cust, String movie, String seat, String time) {
        Ticket newNode = new Ticket(id, cust, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = newNode;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    // Remove Ticket by Id
    public void removeTicket(int id) {
        if (head == null) return;

        Ticket temp = head;
        Ticket prev = tail;

        do {
            if (temp.ticketId == id) {

                if (temp == head) {
                    head = head.next;
                    tail.next = head;
                } 
                else if (temp == tail) {
                    tail = prev;
                    tail.next = head;
                } 
                else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket not found");
    }

    // Display Ticket
    public void display() {
        if (head == null) {
            System.out.println("No tickets booked");
            return;
        }

        Ticket temp = head;
        do {
            System.out.println(
                temp.ticketId + " | " + temp.customerName + " | " +
                temp.movieName + " | " + temp.seatNumber + " | " + temp.bookingTime
            );
            temp = temp.next;
        } while (temp != head);
    }

    // Search by customer
    public void searchByCustomer(String name) {
        if (head == null) return;

        Ticket temp = head;
        do {
            if (temp.customerName.equalsIgnoreCase(name))
                System.out.println(temp.ticketId + " " + temp.movieName + " " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by Id
    public void searchByMovie(String movie) {
        if (head == null) return;

        Ticket temp = head;
        do {
            if (temp.movieName.equalsIgnoreCase(movie))
                System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.seatNumber);
            temp = temp.next;
        } while (temp != head);
    }

    // Count Ticket
    public int count() {
        if (head == null) return 0;

        int c = 0;
        Ticket temp = head;
        do {
            c++;
            temp = temp.next;
        } while (temp != head);
        return c;
    }
}

