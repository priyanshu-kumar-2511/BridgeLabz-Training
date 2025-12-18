import java.util.Scanner;
class multiplesUsingWhile{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking a number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking a number is positive and less than 100
        if (number > 0 && number < 100) {

            System.out.println("Multiples of " + number + " below 100:");

            //Checking the counter is a multiple of number or not 
            int counter = 100;
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } 
        input.close();
    }
}
