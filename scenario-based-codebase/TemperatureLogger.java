/*
11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.
*/

import java.util.Scanner;

public class TemperatureLogger {

    static final int DAYS = 7;
    static float[] temperatureRecords = new float[DAYS];
    static boolean dataAvailable = false;
	
	// asking user for temperature
    static void enterTemperature(Scanner sc) {

        System.out.println("\n------------------------------------------");
        System.out.println(" Please Enter Temperature for 7 Days ");
        System.out.println("------------------------------------------");

        for (int i = 0; i < DAYS; i++) {
            System.out.print("Enter temperature of Day " + (i + 1) + ": ");
            temperatureRecords[i] = sc.nextFloat();
        }

        dataAvailable = true;

        System.out.println("------------------------------------------");
		System.out.println(" Thankyou for giving data ");
        System.out.println(" Temperature data recorded successfully ");
        System.out.println("------------------------------------------");
    }

    // calculating the average temperature
    static void showAverageTemperature() {

        if (!dataAvailable) {
            System.out.println("\nNo data found. Please enter temperature first.");
            return;
        }

        float total = 0;

        for (int i = 0; i < DAYS; i++) {
            total += temperatureRecords[i];
        }

        float average = total / DAYS;

        System.out.println("\n------------------------------------------");
        System.out.println(" Average Temperature for 7 Days : " + average);
        System.out.println("------------------------------------------");
    }

    // finding maximum temperature
    static void showMaximumTemperature() {

        if (!dataAvailable) {
            System.out.println("\nNo data found. Please enter temperature first.");
            return;
        }

        float maxTemp = temperatureRecords[0];
        int maxDay = 1;

        for (int i = 1; i < DAYS; i++) {
            if (temperatureRecords[i] > maxTemp) {
                maxTemp = temperatureRecords[i];
                maxDay = i + 1;
            }
        }

        System.out.println("\n-----------------------------------------------");
        System.out.println(" Maximum Temperature recorded on Day " +maxDay+ " is "+ maxTemp+ " C");
        System.out.println("-------------------------------------------------");
    }

    // displaying all the temperature
    static void showAllTemperatures() {

        if (!dataAvailable) {
            System.out.println("\nNo data found. Please enter temperature first.");
            return;
        }

        System.out.println("\n------------------------------------------");
        System.out.println(" Recorded Temperatures for 7 Days ");
        System.out.println("------------------------------------------");

        for (int i = 0; i < DAYS; i++) {
            System.out.println("Day " + (i + 1) + " -> " + temperatureRecords[i]);
        }

        System.out.println("------------------------------------------");
    }

    // main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n============================================");
            System.out.println("     WELCOME TO TEMPERATURE LOGGER SYSTEM     ");
            System.out.println("==============================================");
            System.out.println("1. Enter Temperature for 7 Days");
            System.out.println("2. Show Average Temperature");
            System.out.println("3. Show Maximum Temperature (with Day)");
            System.out.println("4. Show All Recorded Temperatures");
            System.out.println("5. Exit");
            System.out.println("==========================================");
            System.out.print("Please select your option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    enterTemperature(sc);
                    break;

                case 2:
                    showAverageTemperature();
                    break;

                case 3:
                    showMaximumTemperature();
                    break;

                case 4:
                    showAllTemperatures();
                    break;

                case 5:
                    System.out.println("\n==========================================");
                    System.out.println(" Thank you for using Temperature Logger ");
                    System.out.println("==========================================");
                    System.exit(0);

                default:
                    System.out.println("\nInvalid option. Please choose between 1 to 5.");
            }
        }
    }
}
