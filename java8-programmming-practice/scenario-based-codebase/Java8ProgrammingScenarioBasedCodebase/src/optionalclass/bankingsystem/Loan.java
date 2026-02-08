package optionalclass.bankingsystem;

import java.util.Optional;

public class Loan {

    private String loanType;
    private Double amount;

    public Loan(String loanType, Double amount) {
        this.loanType = loanType;
        this.amount = amount;
    }

    public String getLoanType() {
        return loanType;
    }

    public Double getAmount() {
        return amount;
    }
}
