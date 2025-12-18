import java.util.Scanner;
class factorial{
      public static void main(String [] args){
   
      Scanner input = new Scanner(System.in);

        // taking number from user 
        System.out.print("Enter the number for factorial: ");
        int number = input.nextInt();

        // calculating the factorial
        int originalNumber = number;
        int factorial = 1;

        while (number > 0) {
            factorial *= number;
            number--;
        }
        System.out.println("Factorial of " + originalNumber + " is " + factorial);

        input.close();
      }
}