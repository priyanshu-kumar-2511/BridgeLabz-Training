import java.util.Scanner;
class FrequencyOfDigit{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // Taking input from user
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
		
		// store the digits
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

        int[] frequency = new int[10];

        // Counting frequency of a digit
        for (int i = 0; i < count; i++) {
            frequency[digits[i]]++;
        }

        // Displaying the results
        System.out.println("Frequency of a Digit :");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
        input.close();
    }
}
