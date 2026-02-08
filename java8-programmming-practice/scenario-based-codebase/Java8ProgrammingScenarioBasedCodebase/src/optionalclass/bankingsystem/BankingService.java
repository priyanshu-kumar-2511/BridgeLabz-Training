package optionalclass.bankingsystem;

public class BankingService {

    /* 1️ Nominee Handling */
    public String getNominee(BankAccount account) {
        return account.getNominee().orElse("No Nominee Registered");
    }

    /* 2️ Fetch Loan Details */
    public String getLoanDetails(Customer customer) {
        return customer.getLoan().map(l -> l.getLoanType() + " - Rs" + l.getAmount()).orElse("No Loan Available");
    }

    /* 3️ Minimum Balance if Null */
    public double getBalance(BankAccount account) {
        return account.getBalance().orElse(1000.0);  // minimum balance
    }

    /* 4️ Safe Transaction Reference */
    public String getTransactionRef(Transaction txn) {
        return txn.getReferenceNumber().orElse("Reference Not Available");
    }

    /* 5️ Display Credit Card if Present */
    public void printCreditCard(BankAccount account) {
        account.getCreditCard().ifPresent(card -> {
        	System.out.println("Card Number: " +card.getCardNumber());
            System.out.println("Expiry: " +card.getExpiryDate());
        });
    }
}
