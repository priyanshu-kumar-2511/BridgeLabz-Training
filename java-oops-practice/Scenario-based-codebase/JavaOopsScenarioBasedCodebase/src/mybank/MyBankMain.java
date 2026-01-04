package mybank;

/*7. "MyBank – Managing Customer Accounts"
Story: You're building the core banking module for MyBank, a digital-first bank. Your job is to
manage customer accounts, deposits, and interest calculations.
Requirements:
● Account (base class): fields like accountNumber, balance.
● Derived classes: SavingsAccount, CurrentAccount (using inheritance).
● ITransaction interface: deposit(), withdraw(), checkBalance().
● Use constructors for account initialization with or without an opening balance.
● Encapsulation: balance must be private and only modifiable through methods.
● Use operators for interest: balance * interestRate / 100.
● Polymorphism in calculateInterest() – varies by account type.
● Use access modifiers: protect account data, expose only required operations.
*/
public class MyBankMain {
    public static void main(String[] args) {

        ITransaction acc1 = new SavingsAccount("SB1001", 10000);
        ITransaction acc2 = new CurrentAccount("CA2001", 5000);

        acc1.deposit(2000);
        acc2.withdraw(1000);

        System.out.println("Savings Balance: " + acc1.checkBalance());
        System.out.println("Current Balance: " + acc2.checkBalance());

        Account s = (Account) acc1;
        Account c = (Account) acc2;

        System.out.println("Savings Interest: " + s.calculateInterest());
        System.out.println("Current Interest: " + c.calculateInterest());
    }
}
