package mybank;

public class SavingsAccount extends Account implements ITransaction {

    private static final double INTEREST_RATE = 4.0; // 4%

    public SavingsAccount(String accNo) {
        super(accNo);
    }

    public SavingsAccount(String accNo, double openingBalance) {
        super(accNo, openingBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0)
            setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance())
            setBalance(getBalance() - amount);
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
