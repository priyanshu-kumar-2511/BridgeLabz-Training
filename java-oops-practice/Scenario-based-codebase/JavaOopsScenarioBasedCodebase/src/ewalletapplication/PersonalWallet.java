package EWalletApplication;

public class PersonalWallet extends Wallet {

    public PersonalWallet(double initialBalance) {
        super(initialBalance + 100);  // referral bonus ₹100
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double tax = amount * 0.02;     // 2% tax
        double total = amount + tax;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("You", receiver.getName(), amount));
            System.out.println("Personal Transfer Successful. Tax: ₹" + tax);
        } else {
            System.out.println("❌ Insufficient balance");
        }
    }
}

