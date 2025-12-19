import java.util.Scanner;
class fizzBuzz{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        // taking input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        // Checking the number is positive or not
        if (number <= 0) {
            System.out.println("Not a positive integer.");
        } else {
            
            String[] fizzBuzz = new String[number];
            
            // to store fizzBuzz after checking
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzBuzz[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    fizzBuzz[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    fizzBuzz[i - 1] = "Buzz";
                } else {
                    fizzBuzz[i - 1] = Integer.toString(i);
                }
            }

            // printing the results
            for (int i = 0; i < fizzBuzz.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + fizzBuzz[i]);
            }
        }
        input.close();
    }
}
