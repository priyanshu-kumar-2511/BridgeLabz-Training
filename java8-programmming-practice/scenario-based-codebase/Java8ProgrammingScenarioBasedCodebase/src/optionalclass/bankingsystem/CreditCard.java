package optionalclass.bankingsystem;

public class CreditCard {

    private String cardNumber;
    private String expiryDate;

    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}
