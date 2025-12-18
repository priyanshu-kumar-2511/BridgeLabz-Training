import java.util.Scanner;
public class Celsius_Fahrenheit{
       public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter Temperature in Celsius: ");
       float celsius = sc.nextFloat();
       float fahrenheit = ((celsius * 9.0f/5.0f) + 32);

       System.out.print("Fahrenheit : " + fahrenheit);

       sc.close();
       }
}