package payxpress;

/*25. "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.*/

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Bill> bills = new ArrayList<>();
        bills.add(new ElectricityBill(1200, LocalDate.of(2026, 1, 10)));
        bills.add(new InternetBill(800, LocalDate.of(2026, 1, 5)));
        bills.add(new WaterBill(400, LocalDate.of(2026, 1, 20)));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== PayXpress =====");
            System.out.println("1. View Bills");
            System.out.println("2. Pay a Bill");
            System.out.println("3. Send Reminders");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    for (int i = 0; i < bills.size(); i++) {
                        System.out.println((i + 1) + ". " + bills.get(i).getType() + " | Paid: " + bills.get(i).isPaid());
                    }
                    break;

                case 2:
                    System.out.print("Select bill number: ");
                    int n = sc.nextInt();
                    bills.get(n - 1).pay();
                    break;

                case 3:
                    for (Bill b : bills)
                        if (!b.isPaid())
                            b.sendReminder();
                    break;

                case 4:
                    System.out.println("PayXpress closed");
                    return;
            }
        }
    }
}
