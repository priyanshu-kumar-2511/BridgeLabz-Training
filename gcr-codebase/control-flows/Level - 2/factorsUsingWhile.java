import java.util.Scanner;
class factorsUsingWhile{
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
        System.out.println("Factors of " + number + " are:");
        int counter = 1;
        while (counter < number) {
            if (number % counter == 0) {
                System.out.println(counter);
            }
            counter++;
        }

        input.close();
    }
}









