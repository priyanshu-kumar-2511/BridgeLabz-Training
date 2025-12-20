import java.util.Scanner;
public class UnitConvertor2{
    // 	Creating method of
    // Yards to Feet
    public static double convertYardsToFeet(double yards){
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Feet to Yards
    public static double convertFeetToYards(double feet){
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Meters to Inches
    public static double convertMetersToInches(double meters){
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Inches to Meters
    public static double convertInchesToMeters(double inches){
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Inches to Centimeters
    public static double convertInchesToCentimeters(double inches){
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.print("Enter value: ");
        double value = input.nextDouble();

        double result; // to calculate the result according to the method

        switch (choice) {
            case 1:
                result = convertYardsToFeet(value);
                System.out.println("Result: " + result + " feet");
                break;

            case 2:
                result = convertFeetToYards(value);
                System.out.println("Result: " + result + " yards");
                break;

            case 3:
                result = convertMetersToInches(value);
                System.out.println("Result: " + result + " inches");
                break;

            case 4:
                result = convertInchesToMeters(value);
                System.out.println("Result: " + result + " meters");
                break;

            case 5:
                result = convertInchesToCentimeters(value);
                System.out.println("Result: " + result + " cm");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
