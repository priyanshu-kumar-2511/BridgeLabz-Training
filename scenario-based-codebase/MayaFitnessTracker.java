import java.util.Scanner;

public class MayaBMIFitnessTracker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Maya takes her client's weight
        System.out.print("Enter client's weight in kg: ");
        double clientWeight = input.nextDouble();

        // Maya takes her client's height
        System.out.print("Enter client's height in meters: ");
        double clientHeight = input.nextDouble();

        // Maya calculates BMI using the formula
        double clientBMI = clientWeight / (clientHeight * clientHeight);

        // Display BMI value
        System.out.println("Client's BMI: " + clientBMI);

        // Maya determines the fitness category
        if (clientBMI < 18.5) {
            System.out.println("Fitness Category: Underweight");
        }
        else if (clientBMI >= 18.5 && clientBMI < 25) {
            System.out.println("Fitness Category: Normal");
        }
        else {
            System.out.println("Fitness Category: Overweight");
        }

        input.close();
    }
}
