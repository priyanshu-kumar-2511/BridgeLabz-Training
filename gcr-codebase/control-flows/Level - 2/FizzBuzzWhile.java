import java.util.Scanner;

class FizzBuzzWhile{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking a number from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // checking the number is positive or not
        if (number <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        int i = 1;
        while (i <= number) {

            // if number is divisible by 3 and 5 then print "FizzBuzz"
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } 
            // if the number is divisible by 3 then print "Fizz"
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            } 
            // if the number is divisible by 5 then print "Buzz"
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            } 
            // if the number is not divisible by 3 and 5 then print "i" means number
            else {
                System.out.println(i);
            }
        i++;
        }
        input.close();
    }
}