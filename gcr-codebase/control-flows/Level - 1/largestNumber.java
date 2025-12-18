import java.util.Scanner;
class largestNumber{
      public static void main(String [] args){
     
      Scanner input = new Scanner(System.in);
     
      // Taking firstNumber, secondNumber and thirdNumber from user
      System.out.print("Enter the first number: ");
      int firstNumber = input.nextInt();
      
      System.out.print("Enter the second number: ");
      int secondNumber = input.nextInt();

      System.out.print("Enter the third number: ");
      int thirdNumber = input.nextInt();
    
      // Checking which number is largest
          if ((firstNumber > secondNumber) && (firstNumber > thirdNumber)){
             System.out.print("Is the first number the largest? "+ ((firstNumber > secondNumber) && (firstNumber > thirdNumber)));
          }
          elseif((secondNumber > firstNumber) && (secondNumber > thirdNumber)){
             System.out.print("Is the second number the largest? "+ ((secondNumber > firstNumber) && (secondNumber > thirdNumber)));
          }
          else{
             System.out.print("Is the third number the largest? "+ ((thirdNumber > firstNumber) && (thirdNumber > secondNumber)));
          }

      input.close();

      }
} 
      
