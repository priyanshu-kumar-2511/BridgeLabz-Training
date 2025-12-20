import java.util.Scanner;
public class SumOfNaturalNumbers{
       // Creating recursive method
       public static int sumUsingRecursion(int n){
              if (n == 1) {
              return 1;
           }
           return n + sumUsingRecursion(n - 1);
       }

       // creating Formula method
       public static int sumUsingFormula(int n){
              return n * (n + 1) / 2;
    }

    public static void main(String[] args){
        Scanner intput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking the natural number or not
        if (n <= 0) {
            System.out.println("Invalid input!");
            return;
        }

        // calling method
        int recursiveSum = sumUsingRecursion(number);
        int formulaSum = sumUsingFormula(number);

        System.out.println("Sum using recursion: " + recursiveSum);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Result is correct.");
        } else {
            System.out.println("Result is incorrect.");
        }
    }
}
