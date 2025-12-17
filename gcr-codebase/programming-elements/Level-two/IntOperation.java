import java.util.Scanner;

class IntOperation {
    public static void main(String[] args) {
     
        // Creating Scanner object for taking input from user
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter value of c: ");
        int c = sc.nextInt();

        // Calculating the all the operation
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Displaying the results
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
        
        sc.close();
    }
}
