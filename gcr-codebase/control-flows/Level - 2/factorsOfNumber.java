import java.util.Scanner;
class factorsOfNumber{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        // taking number from user and checking the number is positive integer or not
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Not a positive integer");
            return;
        }

        // printing the factors of a number
        System.out.println("Factors of " + number + " are: ");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        input.close();
    }
}