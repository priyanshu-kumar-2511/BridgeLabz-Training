import java.util.Scanner;
class distanceConvertor{
      public static void main(String[] args){
      
      // Creating the Scanner object for taking input from user
      Scanner sc = new Scanner(System.in);
    
      // Taking input from user
      System.out.print("Enter the distance in feet : ");
      float distanceInFeet = sc.nextFloat();
      
      // Converting Distance In Feet into Yards and Miles
      float distanceInYards = distanceInFeet/3;
      float distanceInMiles = distanceInYards/1760;
      
      // Displaying the final result
      System.out.print("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
      
      sc.close();
      }
}