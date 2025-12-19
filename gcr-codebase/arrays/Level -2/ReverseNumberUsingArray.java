import java.util.Scanner;
class ReverseNumberUsingArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count the digits
        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Storing the digits in array
        int[] digits = new int[count];
        int index = 0;

        if (number == 0) {
            digits[index] = 0;
        } else {
            while (number != 0) {
                digits[index++] = number % 10;
                number /= 10;
            }
        }

        //Displaying the reversed number
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        input.close();
    }
}
