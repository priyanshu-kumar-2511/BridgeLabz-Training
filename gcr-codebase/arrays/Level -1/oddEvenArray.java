import java.util.Scanner;
class oddEvenArray{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // taking input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Checking for natural number
        if (number <= 0) {
            System.out.println("Error");
            return; 
        }

        // Creating arrays size
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        
        int evenIndex = 0;
        int oddIndex = 0;

        // checking the number is even or odd
        for (int index = 1; index <= number; index++) {
            if (index % 2 == 0) {
                even[evenIndex] = index;
                evenIndex++;
            } else {
                odd[oddIndex] = index;
                oddIndex++;
            }
        }

        // Printing even numbers
        System.out.print("Even numbers: ");
        for (int index = 0; index < evenIndex; index++) {
            System.out.print(even[index] + " ");
        }

        // Printing odd numbers
        System.out.print("\nOdd numbers: ");
        for (int index = 0; index < oddIndex; index++) {
            System.out.print(odd[index] + " ");
        }

        input.close();
    }
}
