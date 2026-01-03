package ewalletapplication;

/*4. E-Wallet Application
Scenario: Users can register, load money, transfer funds, and view transaction history.
Concepts Used:
● Class: User, Wallet, Transaction
● Constructors: Initialize wallets with optional referral bonus
● Access Modifiers: Make balance private, expose via getBalance()
● Interface: Transferrable with method transferTo(User receiver, double
amount)
● Operators: Used in deductions, taxes, referral credits
● OOP:
○ Encapsulation: Prevent direct manipulation of balance
○ Abstraction: Expose only essential transaction methods
○ Inheritance: PersonalWallet, BusinessWallet with different limits
○ Polymorphism: Same transferTo() method but different business logic
*/

public class EWalletAppMain {
    public static void main(String[] args) {

        User priyanshu = new User("Priyanshu", new PersonalWallet(1000));
        User shop = new User("TechStore", new BusinessWallet(5000));

        System.out.println("Priyanshu Balance: ₹" + priyanshu.getWallet().getBalance());
        System.out.println("Shop Balance: ₹" + shop.getWallet().getBalance());

        priyanshu.getWallet().transferTo(shop, 500);
        shop.getWallet().transferTo(priyanshu, 1000);

        System.out.println("\nPriyanshu Final Balance: ₹" + priyanshu.getWallet().getBalance());
        System.out.println("Shop Final Balance: ₹" + shop.getWallet().getBalance());

        System.out.println("\nPriyanshu Transaction History:");
        priyanshu.getWallet().showHistory();
    }
}

