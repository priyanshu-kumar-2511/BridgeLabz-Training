/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 0;
        int choose;
        char repeat = 'y';

        do {
            System.out.println("\nMobile operator:");
            System.out.println("1. Airtel");
            System.out.println("2. Vi");
            System.out.println("3. Jio");

            System.out.print("Choose Your Operator: ");
            choose = sc.nextInt();

            switch (choose) {

                case 1:
                    System.out.println("Rs 49 : Unlimited Data for 1 Day");
                    System.out.println("Rs 33 : 2GB Data for 1 Day");
                    break;

                case 2:
                    System.out.println("Rs 51 : Unlimited Data for 1 Day");
                    System.out.println("Rs 33 : 2GB Data for 1 Day");
                    break;

                case 3:
                    System.out.println("Rs 42 : Unlimited Data for 1 Day");
                    System.out.println("Rs 21 : 2GB Data for 1 Day");
                    break;

                default:
                    System.out.println("Invalid Operator");
                    continue;
            }

            System.out.print("Enter the amount: ");
            int amount = sc.nextInt();
            balance += amount;

            System.out.println("Recharge of Rs " + amount + " Successful");
            System.out.println("Current Balance: Rs " + balance);

            System.out.print("Do you want to recharge again? (y/n): ");
            repeat = sc.next().toLowerCase().charAt(0);

        } while (repeat == 'y');

        System.out.println("Thank you for using Recharge Simulator.");
        sc.close();
    }
}

