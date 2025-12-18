import java.util.Scanner;
class countDown{
      public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
     
      // Taking number from user for countdown
      System.out.print("Enter number for countdown: ");
      int counter = input.nextInt();
      
      // Printing the countdown number
      while(counter -->0){
           System.out.println(counter );
      }

      input.close();
      }
}