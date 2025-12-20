import java.util.Scanner;
public class UnitConvertor3{
    // Creating method of
    // Fahrenheit to Celsius
    public static double convertFarhenheitToCelsius(double farhenheit) {
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        return farhenheit2celsius;
    }

    // Celsius to Fahrenheit
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2farhenheit = (celsius * 9 / 5) + 32;
        return celsius2farhenheit;
    }

    // Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        System.out.print("Enter value: ");
        double value = input.nextDouble();

        double result; // to calculate the result according to the method

        switch (choice) {
            case 1:
                result = convertFarhenheitToCelsius(value);
                System.out.println("Result: " + result + " °C");
                break;

            case 2:
                result = convertCelsiusToFarhenheit(value);
                System.out.println("Result: " + result + " °F");
                break;

            case 3:
                result = convertPoundsToKilograms(value);
                System.out.println("Result: " + result + " kg");
                break;

            case 4:
                result = convertKilogramsToPounds(value);
                System.out.println("Result: " + result + " pounds");
                break;

            case 5:
                result = convertGallonsToLiters(value);
                System.out.println("Result: " + result + " liters");
                break;

            case 6:
                result = convertLitersToGallons(value);
                System.out.println("Result: " + result + " gallons");
                break;

            default:
                System.out.println("Invalid choice!");
        }
        input.close();
    }
}
