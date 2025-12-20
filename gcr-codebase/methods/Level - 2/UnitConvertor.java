import java.util.Scanner;
public class UnitConvertor{
    // Creating method of
    // Kilometers to Miles
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        return km * km2miles;
    }
	
    // Miles to Kilometers
    public static double convertMilesToKm(double miles){
        double miles2km = 1.60934;
        return miles * miles2km;
    }
	
    // Meters to Feet
    public static double convertMetersToFeet(double meters){
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }
	
    // Feet to Meters
    public static double convertFeetToMeters(double feet){
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Kilometer to Miles");
        System.out.println("2. Miles to Kilometer");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.print("Enter value: ");
        double value = input.nextDouble();

        double result; // to calculate the result according to the method

        switch (choice) {
            case 1:
                result = convertKmToMiles(value);
                System.out.println("Result: " + result + " miles");
                break;

            case 2:
                result = convertMilesToKm(value);
                System.out.println("Result: " + result + " km");
                break;

            case 3:
                result = convertMetersToFeet(value);
                System.out.println("Result: " + result + " feet");
                break;

            case 4:
                result = convertFeetToMeters(value);
                System.out.println("Result: " + result + " meters");
                break;

            default:
                System.out.println("Invalid choice!");
        }

        input.close();
    }
}
