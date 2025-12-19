import java.util.Scanner;
class bmiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Convertint height from cm to meter
        double heightM = heightCm / 100;

        // Calculating BMI
        double bmi = weight / (heightM * heightM);

        // Diplaying the BMI
        System.out.printf("BMI = %.2f%n", bmi);

        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }

        input.close();
    }
}
