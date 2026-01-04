package com.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    Ticket next;

    Ticket(int id, String cust, String movie, String seat, String time) {
        this.ticketId = id;
        this.customerName = cust;
        this.movieName = movie;
        this.seatNumber = seat;
        this.bookingTime = time;
        this.next = null;
    }
}

