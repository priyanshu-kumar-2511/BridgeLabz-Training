import java.util.Scanner;
class abundantNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        // finding the sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Checking the number is abundant or not
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        input.close();
    }
}
