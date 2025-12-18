import java.util.Scanner;
class factorialInNaturalNumber{
      public static void main(String [] args){
  
      Scanner input = new Scanner(System.in);
      
      // taking number from user
      System.out.print("Enter a natural number: ");
        int number = input.nextInt();
      // checking number is natural number or not
        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

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