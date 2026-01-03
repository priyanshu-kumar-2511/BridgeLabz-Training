package bankmanagementsystem;

public class Main {
	public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount(101, 5000, 5);
        Customer c1 = new Customer("Rahul", 1, sa);

        c1.displayCustomer();
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.calculateInterest();
        sa.displayBalance();
    }
}
