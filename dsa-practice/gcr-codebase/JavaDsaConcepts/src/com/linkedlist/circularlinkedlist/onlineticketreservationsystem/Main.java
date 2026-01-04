package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

/*9. Circular Linked List: Online Ticket Reservation System
Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
Add a new ticket reservation at the end of the circular list.
Remove a ticket by Ticket ID.
Display the current tickets in the list.
Search for a ticket by Customer Name or Movie Name.
Calculate the total number of booked tickets.

Hint:
Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
When removing a ticket, update the circular pointers accordingly.
For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.
*/

public class Main {
    public static void main(String[] args) {

        TicketList list = new TicketList();

        list.addTicket(1, "Rahul", "Inception", "A1", "10:00");
        list.addTicket(2, "Neha", "Inception", "A2", "10:01");
        list.addTicket(3, "Amit", "Avatar", "B1", "10:02");

        list.display();

        System.out.println("\nInception Tickets:");
        list.searchByMovie("Inception");

        list.removeTicket(2);

        System.out.println("\nAfter Cancel:");
        list.display();

        System.out.println("\nTotal Tickets: " + list.count());
    }
}

