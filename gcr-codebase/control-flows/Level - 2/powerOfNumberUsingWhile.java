import java.util.Scanner;
class powerOfNumberUsingWhile{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking a number and power from user
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Checking both number and power are positive integers
        if (number > 0 && power > 0) {

            int result = 1;
            int counter = 0;

         // calculating power of a number using while loop
            while (counter < power) {
                result = result * number;
                counter++;
            }

        // Displaying the result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        } 
        else {
            System.out.println("User input is not positive integers.");
        }

        input.close();
    }
}
