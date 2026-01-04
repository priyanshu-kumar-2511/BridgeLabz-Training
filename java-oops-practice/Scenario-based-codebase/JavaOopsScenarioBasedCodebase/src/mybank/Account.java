package mybank;

public abstract class Account {

    private String accountNumber;   // protected by encapsulation
    private double balance;         // MUST be private

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    public Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    // Encapsulation – controlled access
    public String getAccountNumber() {
        return accountNumber;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // Polymorphic method
    public abstract double calculateInterest();
}
