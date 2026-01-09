package pharmacyinventoryandsalessystem;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiry) {
        super(name, price, expiry);
    }

    public Tablet(String name, double price, LocalDate expiry, int qty) {
        super(name, price, expiry, qty);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now().minusMonths(2));
    }

    @Override
    public double sell(int units) {
        if (!checkExpiry() || !reduceStock(units))
            throw new RuntimeException("Cannot sell tablet");

        return calculateBill(units);
    }

    private double calculateBill(int units) {
        double total = getPrice() * units;
        if (units > 10) total *= 0.9;   // 10% discount
        return total;
    }
}
