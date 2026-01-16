package cropmonitor;

/*8. CropMonitor – Sensor Data Ordering (Quick Sort)
Story: An agri-tech firm uses drone sensors that record soil temperatures at random intervals.
The large data needs to be sorted quickly by timestamp before visualization. Quick Sort is
chosen due to its fast average performance.
Key Concepts:
● Unordered sensor data
● High-speed sorting
● Quick partitioning based on timestamps*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CropMonitor monitor = new CropMonitor();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Crop Monitor =====");
            System.out.println("1. Add Sensor Data");
            System.out.println("2. Sort by Timestamp");
            System.out.println("3. View Sensor Data");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter timestamp: ");
                    long ts = sc.nextLong();

                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();

                    monitor.addSensorData(ts, temp);
                    break;

                case 2:
                    monitor.sortByTimestamp();
                    break;

                case 3:
                    monitor.showData();
                    break;

                case 4:
                    System.out.println("System shutdown");
                    return;
            }
        }
    }
}
