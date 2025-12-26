import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial smart card balance: ");
        int balance = sc.nextInt();

        while (balance > 0) {

            System.out.print("\nEnter travel distance (0 to exit): ");
            int distance = sc.nextInt();

            if (distance == 0) {
                System.out.println("Thank you for using Delhi Metro.");
                break;
            }

            // Fare calculation using ternary operator
            int fare = (distance <= 10) ? 20 : 40;

            if (balance < fare) {
                System.out.println("Insufficient balance. Gate locked.");
                break;
            }

            balance = balance - fare;

            System.out.println("Fare charged: ₹" + fare);
            System.out.println("Remaining balance: ₹" + balance);
        }

        if (balance == 0) {
            System.out.println("\nBalance exhausted. Please recharge.");
        }

        sc.close();
    }
}
