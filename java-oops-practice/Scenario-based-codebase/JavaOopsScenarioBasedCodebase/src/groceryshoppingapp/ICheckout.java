package groceryshoppingapp;

public interface ICheckout {
    void generateBill();
    void applyDiscount(double coupon);
}