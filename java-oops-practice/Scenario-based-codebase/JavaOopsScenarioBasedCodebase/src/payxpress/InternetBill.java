package payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill {

    public InternetBill(double amount, LocalDate date) {
        super("Internet", amount, date);
    }

    public void pay() {
        double total = calculateLateFee();
        if (markPaid())
            System.out.println("Internet bill paid: ₹" + total);
        else
            System.out.println("Already paid");
    }

    public void sendReminder() {
        System.out.println("Reminder: Internet service will be disconnected soon!");
    }
}

