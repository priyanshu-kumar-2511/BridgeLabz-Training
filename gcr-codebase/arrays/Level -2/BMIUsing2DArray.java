import java.util.Scanner;
class BMIUsing2DArray{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();

        double[][] personData = new double[number][3]; // weight,height,bmi
        String[] weightStatus = new String[number];

        // Taking input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Weight input validation
            while (true) {
                System.out.print("Enter weight : ");
                double weight = input.nextDouble();
                if (weight > 0) {
                    personData[i][0] = weight;
                    break;
                }
                System.out.println("Enter a positive value.");
            }

            // Height input validation
            while (true) {
                System.out.print("Enter height : ");
                double height = input.nextDouble();
                if (height > 0) {
                    personData[i][1] = height;
                    break;
                }
                System.out.println("Enter a positive value.");
            }
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {

            double weight = personData[i][0];
            double height = personData[i][1];

            double bmi = weight / (height * height);
            personData[i][2] = bmi;

            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying result
        System.out.println("\nBMI REPORT");
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1));
            System.out.println("Weight : " + personData[i][0] + " kg");
            System.out.println("Height : " + personData[i][1] + " m");
            System.out.println("BMI    : " + String.format("%.2f", personData[i][2]));
            System.out.println("Status : " + weightStatus[i]);
        }

        input.close();
    }
}
