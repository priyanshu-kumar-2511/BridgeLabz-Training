import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and Status for one person
    public static String[] calculateBMIStatus(double weightKg, double heightCm) {

        double heightMeter = heightCm / 100.0;
        double bmi = weightKg / (heightMeter * heightMeter);

        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimals

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weightKg),
                String.valueOf(bmi),
                status
        };
    }

    // Method to compute BMI for all persons
    public static String[][] computeBMIForAll(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            result[i] = calculateBMIStatus(data[i][0], data[i][1]);
        }
        return result;
    }

    // Method to display result in tabular format
    public static void displayBMIReport(String[][] report) {

        System.out.println("\nPerson\tHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < report.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                report[i][0] + "\t\t" +
                report[i][1] + "\t\t" +
                report[i][2] + "\t\t" +
                report[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int members = 10;
        double[][] inputData = new double[members][2];

        // a) Take user input
        for (int i = 0; i < members; i++) {
            System.out.print("\nEnter weight (kg) of person " + (i + 1) + ": ");
            inputData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            inputData[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = computeBMIForAll(inputData);
        displayBMIReport(bmiReport);

        sc.close();
    }
}
