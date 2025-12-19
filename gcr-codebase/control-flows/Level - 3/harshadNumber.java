import java.util.Scanner;
class harshadNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int originalNumber = number; 
        int sum = 0;

        // calculating the sum of digits
        while (number != 0) {
            int digit = number % 10;  
            sum = sum + digit;        
            number = number / 10;     
        }

        // Checking the original number is divisible by sum of digits or not
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        input.close();
    }
}
