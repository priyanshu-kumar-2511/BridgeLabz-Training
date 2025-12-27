package com.constructor.level1;

public class SavingsAccount extends AccountRecord {

    double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder,
                          double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void display() {
        System.out.println("Account Number : " + accountNumber);   // public
        System.out.println("Account Holder : " + accountHolder);   // protected
        System.out.println("Balance        : " + getBalance());    // private via getter
        System.out.println("Interest Rate  : " + interestRate);
        System.out.println();
    }

    public static void main(String[] args) {

        SavingsAccount s =
                new SavingsAccount("ACC101", "Priyanshu", 50000, 4.5);

        s.display();

        s.setBalance(60000);
        System.out.println("Updated Balance: " + s.getBalance());
    }
}
