package optionalclass.bankingsystem;

import java.util.Optional;

public class Customer {

    private String name;
    private Loan loan;  

    public Customer(String name, Loan loan) {
        this.name = name;
        this.loan = loan;
    }

    public String getName() {
        return name;
    }

    public Optional<Loan> getLoan() {
        return Optional.ofNullable(loan);
    }
}
