package payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill {

    public WaterBill(double amount, LocalDate date) {
        super("Water", amount, date);
    }

    public void pay() {
        double total = calculateLateFee();
        if (markPaid())
            System.out.println("Water bill paid: Rs" + total);
        else
            System.out.println("Already paid");
    }

    public void sendReminder() {
        System.out.println("Reminder: Water bill pending!");
    }
}
