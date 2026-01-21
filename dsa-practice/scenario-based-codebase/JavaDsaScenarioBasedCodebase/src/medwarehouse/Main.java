package medwarehouse;

/*10. MedWarehouse – Sorting Medicines by Expiry (Merge Sort)
Story: A pharmaceutical warehouse handles medicine records from multiple branches, each
sending a sorted list by expiry date. To ensure none are wasted, the system uses Merge Sort
to compile all expiry dates and alert if any medicine is nearing expiration.
Concepts Involved:
● Merge Sort
● Sorted sublist merging
● Critical for time-sensitive inventory*/

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Medicine> medicines = new ArrayList<>();

        System.out.print("Enter number of medicines: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nMedicine " + i);

            System.out.print("Enter medicine name: ");
            String name = scanner.nextLine();

            System.out.print("Enter expiry date (YYYY-MM-DD): ");
            String dateInput = scanner.nextLine();

            LocalDate expiryDate = LocalDate.parse(dateInput);

            medicines.add(new Medicine(name, expiryDate));
        }

        List<Medicine> sortedMedicines = MergeSort.sort(medicines);

        System.out.println("\nMedicines Sorted by Expiry Date:");
        for (Medicine m : sortedMedicines) {
            System.out.println(m);
        }

        System.out.println("\nMedicines Near Expiry (within 30 days):");
        LocalDate today = LocalDate.now();

        boolean found = false;
        for (Medicine m : sortedMedicines) {
            if (!m.getExpiryDate().isAfter(today.plusDays(30))) {
                System.out.println(m);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No medicines near expiry.");
        }

    }
}
