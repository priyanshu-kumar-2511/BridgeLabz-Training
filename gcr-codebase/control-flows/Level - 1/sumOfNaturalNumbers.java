import java.util.Scanner;
class sumOfNaturalNumbers{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        // Sum using while loop
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }

        // Sum using formula
        int sumNaturalNumber = n * (n + 1) / 2;

        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + sumNaturalNumber);

        if (sum == sumNaturalNumber) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Results do NOT match");
        }

        sc.close();
    }
}
