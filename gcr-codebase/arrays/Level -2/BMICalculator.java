import java.util.Scanner;
class BMICalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();

        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for weight and height
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.print("Enter weight: ");
            weight[i] = input.nextDouble();

            System.out.print("Enter height: ");
            height[i] = input.nextDouble();
        }

        // Calculating the BMI and status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying result
        System.out.println("\nBMI REPORT ");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Height: " + height[i] + " m");
            System.out.println("Weight: " + weight[i] + " kg");
            System.out.printf("BMI: %.2f\n", bmi[i]);
            System.out.println("Status: " + status[i]);
        }
        input.close();
    }
}
