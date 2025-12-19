import java.util.Scanner;
class primeNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking a number from user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        // Boolean variable to store prime result
        boolean isPrime = true;

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } 
        else {
            for (int i = 2; i < num; i++) {
                // Checking if any number is divisible by an other number then it is not prime number
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Displaying the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is not a Prime Number");
        }
        input.close();
    }
}
