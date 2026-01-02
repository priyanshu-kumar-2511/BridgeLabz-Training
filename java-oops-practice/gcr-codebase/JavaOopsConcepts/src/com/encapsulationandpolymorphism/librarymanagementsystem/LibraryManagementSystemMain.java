package com.encapsulationandpolymorphism.librarymanagementsystem;

import java.util.*;

public class LibraryManagementSystemMain {
    public static void main(String[] args) {

        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book("B101", "Java Programming", "James Gosling"));
        items.add(new Magazine("M202", "Tech Today", "Editorial Team"));
        items.add(new DVD("D303", "AI Revolution", "OpenAI"));

        for (LibraryItem item : items) {
            System.out.println("---------------------------------");
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            Reservable r = (Reservable) item;
            System.out.println("Available: " + r.checkAvailability());
            r.reserveItem("Priyanshu");
        }
    }
}

