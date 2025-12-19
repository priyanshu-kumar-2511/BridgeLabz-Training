import java.util.Scanner;
class armstrongNumber{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // taking a number from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // to store the sum of the powers of digits
        int sum = 0;
        
        int originalNumber = number;
        int numberOfDigits = String.valueOf(number).length();
        
        // calculating the sum of power 
        while (number != 0) {
            int digit = number % 10;  
            sum += Math.pow(digit, numberOfDigits);  
            number /= 10;  
        }
        
        // Checking the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        input.close();
    }
}
