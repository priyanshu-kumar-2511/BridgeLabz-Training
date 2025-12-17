import java.util.Scanner;
class convertDistance{
      public static void main(String [] args){
      
      // Creating Scanner object to take input from user
      Scanner sc = new Scanner(System.in);

      // Taking user input for kilometer
      double km = sc.nextInt();
      
      // formula to calculate miles
      double kmToMiles = km * 0.621;
     
      System.out.println("The total miles is "+ kmToMiles +" mile for the given " + km +" km");
      }
}
      
      
      