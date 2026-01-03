package hospitalpatientmanagementsystem;

public class Bill implements Payable {

    private Patient patient;
    private double baseAmount;

    public Bill(Patient patient, double baseAmount) {
        this.patient = patient;
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * 0.10;     // 10% hospital tax
        double discount = 0;

        if (patient instanceof InPatient) {
            discount = baseAmount * 0.05;   // 5% discount for long stay
        }

        return baseAmount + tax - discount;
    }
}

