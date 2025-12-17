import java.util.Scanner;
class DoubleOperation {
    public static void main(String[] args) {

        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calculating all the opertaions
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Displaying the results
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4 );
        sc.close();
    }
}