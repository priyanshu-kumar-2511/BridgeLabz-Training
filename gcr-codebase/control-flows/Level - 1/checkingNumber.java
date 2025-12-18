import java.util.Scanner;
class checkingNumber{
      public static void main(String[] args){
 
      Scanner input = new Scanner(System.in);
 
      // Taking a number from user
      System.out.print("Enter a number: ");
      int number = input.nextInt();
    
      // Checking a number is positive, negative and zero
      if(number > 0){
         System.out.print("Positive");
      }
      else if(number < 0){
         System.out.print("Negative");
      }
      else{
         System.out.print("Zero");
      }
 
      input.close();
      }
}