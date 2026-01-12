package callcenter;

import java.util.Scanner;

/*4. CallCenter – Customer Queue Manager (Queue + HashMap)
Story: In a telecom call center, customers are queued based on the time of call. Priority
customers have a special queue. A HashMap keeps track of the number of times each user has
called this month.
Requirements:

● Use Queue for managing incoming calls.
● Use HashMap for customer data.
● Priority Queue for VIP customers.*/

public class Main {
    public static void main(String[] args) {

        CallCenter callCenter = new CallCenter();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Call Center =====");
            System.out.println("1. New Call");
            System.out.println("2. Handle Next Call");
            System.out.println("3. Check Call Count");
            System.out.println("4. Exit");
            System.out.print("Choose: ");

            int choose = sc.nextInt();
            sc.nextLine();

            switch (choose) {
                case 1:
                    System.out.print("Enter number: ");
                    String number = sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("VIP? (true/false): ");
                    boolean vip = sc.nextBoolean();

                    callCenter.receiveCall(new Customer(number, name, vip));
                    break;

                case 2:
                	callCenter.handleNextCall();
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    String callHistory = sc.nextLine();
                    callCenter.showCallCount(callHistory);
                    break;

                case 4:
                    System.out.println("Call Center closed");
                    return;
            }
        }
    }
}
