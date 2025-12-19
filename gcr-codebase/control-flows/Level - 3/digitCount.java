import java.util.Scanner;

class digitCount{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        // taking a number from user
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int count = 0;
        // counting the digit of a number
        if (number == 0) {
            count = 1; 
        } else {
            // Loop until the number becomes 0
            while (number != 0) {
                number = number / 10;
                count++;
            }
        }

        // displaying the result
        System.out.println("The number of digits is: " + count);

        input.close();
    }
}
