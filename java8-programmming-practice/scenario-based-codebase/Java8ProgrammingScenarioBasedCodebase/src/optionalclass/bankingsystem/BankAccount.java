package optionalclass.bankingsystem;

import java.util.Optional;

public class BankAccount {

    private String accountNumber;
    private String nominee;       
    private Double balance;        
    private CreditCard creditCard; 

    public BankAccount(String accountNumber, String nominee, Double balance, CreditCard creditCard) {
        this.accountNumber = accountNumber;
        this.nominee = nominee;
        this.balance = balance;
        this.creditCard = creditCard;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Optional<String> getNominee() {
        return Optional.ofNullable(nominee);
    }

    public Optional<Double> getBalance() {
        return Optional.ofNullable(balance);
    }

    public Optional<CreditCard> getCreditCard() {
        return Optional.ofNullable(creditCard);
    }
}
