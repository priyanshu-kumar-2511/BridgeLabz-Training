package EWalletApplication;

import java.util.*;

public abstract class Wallet implements Transferrable {

    private double balance;                     // encapsulated
    protected List<Transaction> history = new ArrayList<>();

    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    protected void credit(double amount) {
        balance += amount;
    }

    protected boolean debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void showHistory() {
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
}

