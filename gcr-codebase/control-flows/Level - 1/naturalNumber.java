import java.util.Scanner;
class naturalNumber{
      public static void main(String[] args){
    
      Scanner input = new Scanner(System.in);

      // Taking number from user
      System.out.print("Enter a number: ");
      int number = input.nextInt();
 
      // Checking the number is natural number or not , if yes then calculate the sum of the n natural numbers
          if (number >= 0){
              int sum = (number * (number + 1))/2;
              System.out.print("The sum of " + number + " natural number is "+ sum);
          }
          else{
               System.out.print("The number "+number+" is not a natural number");
              }
        
      input.close();
      }
}
          