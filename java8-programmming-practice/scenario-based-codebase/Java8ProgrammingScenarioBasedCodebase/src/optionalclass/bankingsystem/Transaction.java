package optionalclass.bankingsystem;

import java.util.Optional;

public class Transaction {

    private String referenceNumber; 

    public Transaction(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public Optional<String> getReferenceNumber() {
        return Optional.ofNullable(referenceNumber);
    }
}
