package pharmacyinventoryandsalessystem;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiry) {
        super(name, price, expiry);
    }

    public Syrup(String name, double price, LocalDate expiry, int qty) {
        super(name, price, expiry, qty);
    }

    @Override
    public boolean checkExpiry() {
        return expiryDate.isAfter(LocalDate.now().plusDays(7));
    }

    @Override
    public double sell(int units) {
        if (!checkExpiry() || !reduceStock(units))
            throw new RuntimeException("Cannot sell syrup");

        return getPrice() * units;
    }
}
