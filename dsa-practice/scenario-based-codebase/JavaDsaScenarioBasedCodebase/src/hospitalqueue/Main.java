package hospitalqueue;

/*1. HospitalQueue – Patient Sorting by Criticality (Bubble Sort)
Story: At Apollo Hospital, patients in the ER are initially listed by arrival time. However, before
assigning beds, the staff wants to sort them by criticality level (1–10). Since the list is usually
small (10–20 patients), Bubble Sort is used to quickly sort patients in-place without using extra
memory.
Key Concepts:
● Bubble Sort for small datasets
● In-place comparison
● Swapping adjacent patient records
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HospitalQueue er = new HospitalQueue();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Apollo ER Desk =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Sort by Criticality");
            System.out.println("3. Show Patient Queue");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter criticality (1-10): ");
                    int level = sc.nextInt();

                    er.addPatient(name, level);
                    break;

                case 2:
                    er.sortByCriticality();
                    break;

                case 3:
                    er.showQueue();
                    break;

                case 4:
                    System.out.println("ER system closed");
                    return;
            }
        }
    }
}
