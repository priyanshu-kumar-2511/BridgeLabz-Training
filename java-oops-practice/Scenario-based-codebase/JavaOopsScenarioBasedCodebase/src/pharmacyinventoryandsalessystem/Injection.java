package pharmacyinventoryandsalessystem;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiry) {
        super(name, price, expiry);
    }

    public Injection(String name, double price, LocalDate expiry, int qty) {
        super(name, price, expiry, qty);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now());
    }

    @Override
    public double sell(int units) {
        if (!checkExpiry() || !reduceStock(units))
            throw new RuntimeException("Cannot sell injection");

        return getPrice() * units + 50;  // handling fee
    }
}

