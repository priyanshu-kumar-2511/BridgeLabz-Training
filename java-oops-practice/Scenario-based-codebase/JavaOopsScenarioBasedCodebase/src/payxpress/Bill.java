package payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable {

    private String type;
    private double amount;
    private LocalDate dueDate;
    private boolean isPaid;       // Encapsulated

    protected Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected double calculateLateFee() {
        if (LocalDate.now().isAfter(dueDate))
            return amount + 100;     // base + penalty
        return amount;
    }

    protected boolean markPaid() {
        if (isPaid) return false;
        isPaid = true;
        return true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected String getType() {
        return type;
    }
}
