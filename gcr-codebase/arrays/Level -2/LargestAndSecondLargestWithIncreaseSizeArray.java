import java.util.Scanner;
class LargestAndSecondLargestWithIncreaseSizeArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        number = Math.abs(number); 

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        if (number == 0) {
            digits[index++] = 0;
        }

        while (number != 0) {

            // If the array size is full then increase its size
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];

                for (int i = 0; i < digits.length; i++) {
                    temp[i] = digits[i];
                }
                digits = temp; 
            }
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        // Finding the largest and second-largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the result
        if (secondLargest == -1) {
            System.out.println("No second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }

        input.close();
    }
}
