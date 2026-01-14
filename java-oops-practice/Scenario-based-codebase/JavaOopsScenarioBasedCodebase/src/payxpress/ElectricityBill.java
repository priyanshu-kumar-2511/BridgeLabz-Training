package payxpress;

import java.time.LocalDate;
public class ElectricityBill extends Bill {

    public ElectricityBill(double amount, LocalDate date) {
        super("Electricity", amount, date);
    }

    public void pay() {
        double total = calculateLateFee();
        if (markPaid())
            System.out.println("⚡ Electricity bill paid: ₹" + total);
        else
            System.out.println("Already paid");
    }

    public void sendReminder() {
        System.out.println("⚡ Reminder: Pay your electricity bill!");
    }
}
