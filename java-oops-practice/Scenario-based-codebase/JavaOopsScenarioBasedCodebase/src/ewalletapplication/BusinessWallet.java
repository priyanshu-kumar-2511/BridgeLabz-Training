package EWalletApplication;

public class BusinessWallet extends Wallet {

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void transferTo(User receiver, double amount) {
        double fee = amount * 0.01;   // 1% business fee
        double total = amount + fee;

        if (debit(total)) {
            receiver.getWallet().credit(amount);
            history.add(new Transaction("Business", receiver.getName(), amount));
            System.out.println("Business Transfer Successful. Fee: ₹" + fee);
        } else {
            System.out.println("❌ Insufficient business balance");
        }
    }
}
