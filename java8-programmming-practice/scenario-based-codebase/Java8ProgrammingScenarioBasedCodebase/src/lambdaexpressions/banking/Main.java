package lambdaexpressions.banking;

/*Scenario 4: Banking / Finance

1.Use lambda to check minimum balance rule.

2.Use lambda to calculate simple interest.

3.Use lambda to validate withdrawal amount.

4.Use lambda to print account details.

5.Use lambda to compare two account balances.*/

import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new Account("Priyanshu", 10000));
        accounts.add(new Account("Sakshi", 20000));

        // Minimum Balance Rule (>= 10000)
        System.out.println("Minimum Balance Checker");
        Predicate<Account> minimumBalance = account -> account.getBalance() >= 10000;

        accounts.forEach(account -> System.out.println(account.getAccountHolder() + " : " + (minimumBalance.test(account) ? "Valid Balance" : "Low Balance")));

        System.out.println();

        // Simple Interest Calculation
        // Formula: (P * R * T) / 100
        BiFunction<Double, Double, Double> simpleInterest = (principal, rate) -> (principal * rate * 2) / 100;  

        System.out.println("Simple Interest on 10000 at 5% for 2 years: " + simpleInterest.apply(10000.0, 5.0));

        System.out.println();

        // Validate Withdrawal
        BiPredicate<Account, Double> validateWithdrawal = (account, amount) -> amount > 0 && amount <= account.getBalance();

        Account acc = accounts.get(0);
        double withdrawAmount = 5000;

        System.out.println("Withdrawal Validation: " + validateWithdrawal.test(acc, withdrawAmount));

        System.out.println();

        // Print Account Details
        Consumer<Account> printAccount = account -> System.out.println(account);

        System.out.println("Account Details:");
        accounts.forEach(printAccount);

        System.out.println();

        // Compare Two Account Balances
        BiFunction<Account, Account, String> compareBalance = (a1, a2) -> a1.getBalance() > a2.getBalance() ? a1.getAccountHolder() + " has more balance" : a2.getAccountHolder() + " has more balance";

        System.out.println("Balance Comparison:");
        System.out.println(compareBalance.apply(accounts.get(0), accounts.get(1)));
    }
}
