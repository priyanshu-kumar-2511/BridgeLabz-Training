/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;
public class PhoneRechargeSimulator{
    public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Mobile operator: ");
	System.out.println("1. Airtle");
	System.out.println("2. Vi");
	System.out.println("3. Jio");
	
	System.out.print("Choose Your Operator: ");
	int choose = sc.nextInt();
	int balance;
	switch(choose){
		System.out.println(" ");
		case 1 : 
		        System.out.println("Rs 49 : Unlimited Data for 1 Days");
		        System.out.println("Rs 33 : 2gb data for 1 Days");
				System.out.print("Enter the amount: ");
				balance = sc.nextInt();
				System.out.println("Recharge of "+ balance +" Succesfully");
				break;
		case 2 : 
                System.out.println("Rs 51 : Unlimited Data for 1 Days");
		        System.out.println("Rs 33 : 2gb data for 1 Days");
				System.out.print("Enter the amount: ");
				balance = sc.nextInt();
				System.out.println("Recharge of "+ balance +" Succesfully");
				break;	
        case 3 : 
                System.out.println("Rs 42 : Unlimited Data for 1 Days");
		        System.out.println("Rs 21 : 2gb data for 1 Days");
				System.out.print("Enter the amount: ");
				balance = sc.nextInt();
				System.out.println("Recharge of Rs "+ balance +" Succesfully Done");
				break;	
    }
    }	
}	