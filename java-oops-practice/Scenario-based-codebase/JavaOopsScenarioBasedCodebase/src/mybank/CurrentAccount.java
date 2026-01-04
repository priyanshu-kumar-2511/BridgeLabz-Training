package mybank;

public class CurrentAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 1.5; // 1.5%

    public CurrentAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0)
            setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount); // overdraft allowed
    }

    @Override
    public double checkBalance() {
        return getBalance();
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE / 100;
    }
}
