import java.util.Scanner;
public class BMICalculator {

    // creating method to calculate BMI 
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            data[i][2] = weight / (heightM * heightM);
        }
    }

    // creating method to BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 10 persons, 3 (weight, height, BMI)
        double[][] data = new double[10][3];

        // taking input from user
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // calculating BMI
        calculateBMI(data);

        // calculating BMI status
        String[] status = getBMIStatus(data);

        // printing the results
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Person " + (i + 1) +
                " | Weight: " + data[i][0] +
                " kg | Height: " + data[i][1] +
                " cm | BMI: " + String.format("%.2f", data[i][2]) +
                " | Status: " + status[i]
            );
        }
        sc.close();
    }
}
