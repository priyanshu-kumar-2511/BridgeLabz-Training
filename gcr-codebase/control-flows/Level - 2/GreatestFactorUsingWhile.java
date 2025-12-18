import java.util.Scanner;
class GreatestFactorUsingWhile{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();  

        // checking the greatest factor of a number
        int greatestFactor = 1;
        int counter = number - 1;
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                System.out.println("The greatest factor of " + number + " is: " + greatestFactor);
                break; 
            }
            counter--;
        }
        input.close();
    }
}