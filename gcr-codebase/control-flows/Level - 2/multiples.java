import java.util.Scanner;
class multiples{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking a number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking the number is positive and less than 100
        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");

        // Checking the i is a multiple of number
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        } 
        input.close();
    }
}
