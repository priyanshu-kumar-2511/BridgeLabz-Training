import java.util.Scanner;
class checkingFirstSmallestNumber{
      public static void main(String[] args){
      
      // Creating Scanner object for taking input from user
      Scanner input = new Scanner(System.in);
      
      // Taking number1, number2, number3 from user 
      System.out.print("Enter the first number: ");
      int number1 = input.nextInt();
   
      System.out.print("Enter the second number: ");
      int number2 = input.nextInt();

      System.out.print("Enter the third number: ");
      int number3 = input.nextInt();

      // Checking the number1 is smallest of the 3 numbers
         if((number1 < number2) && (number1 < number3)){
             System.out.print("Is the first number the smallest? "+ ((number1 < number2) && (number1 < number3)));
         }
         else{
              System.out.print("Is the first number the smallest? "+ ((number1 < number2) && (number1 < number3)));
         }
       
      input.close();
      }
} 

