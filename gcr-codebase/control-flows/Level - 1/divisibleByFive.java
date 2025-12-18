import java.util.Scanner;
class divisibleByFive{
      public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      // Taking input from user for a number
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      
      // Checking the number is divisible by 5 or not
         if(number % 5 == 0){
           System.out.print("Is the number " +number+ " divisible by 5? " + (number % 5 == 0));
         } 
         else{
            System.out.print("Is the number " +number+ " divisible by 5? " + (number % 5 == 0));
         }
 
      input.close();       
      }
}
      