package com.constructor.level1;

public class HotelBooking {
	String guestName;
    String roomType;
    int nights;

    // Default constructor
    public HotelBooking() {
        this("Unknown", "Standard", 1);
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking h) {
        this(h.guestName, h.roomType, h.nights);
    }

    void display() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type : " + roomType);
        System.out.println("Nights    : " + nights);
        System.out.println();
    }

    public static void main(String[] args) {

        // Default booking
        HotelBooking b1 = new HotelBooking();

        // User provided booking
        HotelBooking b2 = new HotelBooking("Priyanshu", "Deluxe", 3);

        // Copy booking
        HotelBooking b3 = new HotelBooking(b2);

        b1.display();
        b2.display();
        b3.display();
    }
}
