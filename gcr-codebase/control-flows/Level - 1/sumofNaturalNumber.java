import java.util.Scanner;
class sumofNaturalNumber{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        // Sum using for loop
        int sumUsingLoop = 0;
        for (int i=1; i<=number; i++){
            sumUsingLoop += i;
        }

        // Sum using formula
        int sumUsingFormula = number * (number + 1) / 2;

        System.out.println("Sum using for loop: " + sumUsingLoop);
        System.out.println("Sum using formula: " + sumUsingFormula);

        if (sumUsingLoop == sumUsingFormula) {
            System.out.println("Both results are equal");
        } else {
            System.out.println("Results do NOT match");
        }

        sc.close();
    }
}
