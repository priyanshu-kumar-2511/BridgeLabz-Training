/*
15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.
*/

import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int finePerDay = 5;
        int totalFine = 0;

        System.out.println("========================================");
        System.out.println("      ROHAN'S LIBRARY FINE SYSTEM");
        System.out.println("========================================");
        System.out.println("Fine Rule: Rs 5 per day for late return");
        System.out.println("----------------------------------------");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nBook " + i + " Details");
            System.out.println("----------------------------------------");

            System.out.print("Enter Due Date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate = sc.nextInt();

            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * finePerDay;
                totalFine += fine;

                System.out.println("Late by " + lateDays + " day(s)");
                System.out.println("Fine for this book: Rs " + fine);
            } 
            else {
                System.out.println("Returned on time. No fine.");
            }
        }

        System.out.println("\n========================================");
        System.out.println("Total Fine to be Paid: Rs " + totalFine);
        System.out.println("========================================");
    }
}
