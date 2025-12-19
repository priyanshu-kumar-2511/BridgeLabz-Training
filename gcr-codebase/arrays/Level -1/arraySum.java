import java.util.Scanner;
class arraySum{
    public static void main(String[] args){
        
        double[] numbers = new double[10];        
        double total = 0.0;
        int index = 0;
        
        Scanner sc = new Scanner(System.in);
        
        // taking input from user
        while (true) {
            System.out.print("Enter a number (0 or negative number to stop): ");
            double input = sc.nextDouble();
            
            // Checking the user entered 0 or a negative number, or if the array is full
            if (input <= 0 || index == 10) {
                break;
            }
            
            // Storing the number in the array and increment in the index
            numbers[index] = input;
            index++;
        }
        
        // Calculating the total of the numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }
        
        // Displaying the numbers
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
        }
        
        // Displaying the sum of the numbers
        System.out.println("Total sum: " + total);
        
        sc.close();
    }
}
