import java.util.Scanner;
class GreatestFactor{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();  

        int greatestFactor = 1;
        // checking the greatest factor of a number
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;  
                System.out.print("The greatest factor of "+ number +" is: " + greatestFactor);
                break;  
            }
        }
        input.close();
    }
}