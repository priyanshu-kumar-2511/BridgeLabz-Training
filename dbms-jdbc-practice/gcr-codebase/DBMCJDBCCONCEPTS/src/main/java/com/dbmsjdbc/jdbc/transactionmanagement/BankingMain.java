package com.dbmsjdbc.jdbc.transactionmanagement;

/*Exercise 2: Transaction Management
Implement a banking system with:
• Transfer money between accounts (use transactions)
• Check balance
• Transaction history*/

import java.math.BigDecimal;
import java.util.Scanner;

public class BankingMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService service = new BankService();

        while (true) {

            System.out.println("\n===== Banking System =====");
            System.out.println("1. Transfer Money");
            System.out.println("2. Check Balance");
            System.out.println("3. Transaction History");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("From Account ID: ");
                    int from = sc.nextInt();

                    System.out.print("To Account ID: ");
                    int to = sc.nextInt();

                    System.out.print("Amount: ");
                    BigDecimal amount = sc.nextBigDecimal();

                    service.transferMoney(from, to, amount);
                    break;

                case 2:
                    System.out.print("Account ID: ");
                    int id = sc.nextInt();
                    service.checkBalance(id);
                    break;

                case 3:
                    System.out.print("Account ID: ");
                    int accId = sc.nextInt();
                    service.showTransactionHistory(accId);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}