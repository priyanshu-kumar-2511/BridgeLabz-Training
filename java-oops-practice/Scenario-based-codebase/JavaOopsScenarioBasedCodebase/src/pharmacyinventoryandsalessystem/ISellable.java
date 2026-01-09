package pharmacyinventoryandsalessystem;

public interface ISellable {
    boolean checkExpiry();
    double sell(int units);
}

