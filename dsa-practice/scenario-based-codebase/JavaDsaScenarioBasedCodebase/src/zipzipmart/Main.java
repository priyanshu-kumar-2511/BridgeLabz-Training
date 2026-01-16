package zipzipmart;

/*3. ZipZipMart – Daily Sales Summary Report (Merge Sort)
Story: ZipZipMart compiles thousands of daily sales records from all branches. To generate
reports, the system sorts transactions by date and amount using Merge Sort, which ensures
stability and efficiency with large datasets.
Key Concepts:
● Divide and conquer
● Large-scale sorting
● Preserves order of equal items (stable)*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SalesReport report = new SalesReport();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ZipZipMart Sales System =====");
            System.out.println("1. Add Sale Record");
            System.out.println("2. Sort Sales (Merge Sort)");
            System.out.println("3. View Sales Report");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter date (YYYY-MM-DD): ");
                    String date = sc.next();

                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();

                    report.addSale(date, amt);
                    break;

                case 2:
                    report.sortByDateAndAmount();
                    break;

                case 3:
                    report.showReport();
                    break;

                case 4:
                    System.out.println("System closed");
                    return;
            }
        }
    }
}
