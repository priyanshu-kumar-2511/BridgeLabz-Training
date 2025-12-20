import java,util.Scanner;
public class WindChillCalculator{

    // create method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
		
		// taking input from user
        double temperature = input.nextDouble();   
        double windSpeed = input.nextDouble();     

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature is " + windChill);
    }
}
