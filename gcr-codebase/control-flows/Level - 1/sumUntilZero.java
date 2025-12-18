import java.util.Scanner;
class sumUntilZero{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        //Taking initial total is 0
        double total = 0.0;
        double number;
        // Taking number from user 
        System.out.print("Enter a number: ");
        number = sc.nextDouble();

        // Checking number is zero or not
        while (number != 0) {
            total += number;
            
            // User need to re-enter the number value until user enter zero as a number
            System.out.print("Enter a number: ");
            number = sc.nextDouble();
        }

        System.out.println("The total sum is " + total);

        sc.close();
    }
}

