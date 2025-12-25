import java.util.Scanner;

public class CoffeeCounterChronicles {

    static double GST_RATE = 0.05;   // 5% GST

    // Method to return coffee price based on type
    public static double getCoffeePrice(String coffeeType) {
        switch (coffeeType) {
            case "Espresso":
                return 120;
            case "Latte":
                return 150;
            case "Cappuccino":
                return 180;
            default:
                return 0;
        }
    }

    // Method to calculate final bill including GST
    public static double calculateFinalBill(double coffeePrice, int coffeeQuantity) {
        double totalCost = coffeePrice * coffeeQuantity;
        double gstAmount = totalCost * GST_RATE;
        return totalCost + gstAmount;
    }

    public static void main(String[] args) {

        Scanner cafeInput = new Scanner(System.in);
        String coffeeType;

        System.out.println("Welcome to Ravi's Cafe");

        // One customer can place multiple orders
        while (true) {

            System.out.print("\nEnter coffee type (Espresso / Latte / Cappuccino) or type exit to finish: ");
            coffeeType = cafeInput.nextLine();

            // exit means customer is done ordering
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for your order!");
                break;
            }

            double coffeePrice = getCoffeePrice(coffeeType);

            if (coffeePrice == 0) {
                System.out.println("Invalid coffee type. Try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int coffeeQuantity = cafeInput.nextInt();
            cafeInput.nextLine(); 

            double finalBill = calculateFinalBill(coffeePrice, coffeeQuantity);

            System.out.println("Amount to pay (with GST): ₹" + finalBill);
        }

        cafeInput.close();
    }
}
