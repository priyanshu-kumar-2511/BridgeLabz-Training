import java.util.Scanner(System.in);
class QuotientAndRemainder {
    public static void main(String[] args) {

        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        
        // Calculating the quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Displaying the results
        System.out.println("The Quotient is " + quotient +
                           " and Reminder is " + remainder +
                           " of two number " + number1 + " and " + number2);
        sc.close();
    }
}