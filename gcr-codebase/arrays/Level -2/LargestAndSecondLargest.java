import java.util.Scanner;
class LargestAndSecondLargest{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0) {
            if (index == maxDigit) {
                break;  
            }
            digits[index] = number % 10; 
            number /= 10;  
            index++;  
        }
        
        int largest = -1;
        int secondLargest = -1;
        
        //Finding the largest and second largest numbers
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        // Displaying the results
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit.");
        } else {
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
        input.close();
    }
}
