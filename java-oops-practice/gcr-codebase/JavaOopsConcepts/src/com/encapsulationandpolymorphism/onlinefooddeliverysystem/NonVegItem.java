package com.encapsulationandpolymorphism.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {

    private double extraCharge = 50;   // non-veg handling cost

    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + extraCharge;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;   // only 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Discount: 5% (Extra charge applied)";
    }
}
