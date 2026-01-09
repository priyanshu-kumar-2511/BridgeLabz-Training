package restaurantorderingsystem;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    public Order(FoodItem... foodItems) {
        for (FoodItem f : foodItems) {
            items.add(f);
        }
    }

    private void calculateTotal() {
        total = 0;

        for (FoodItem f : items) {
            double price = f.getPrice();
            double discount = price * f.getDiscount();
            total += (price - discount);
        }
    }
    
    @Override
    public void placeOrder() {

        System.out.println("Your Order:");
        System.out.println("---------------------");

        for (FoodItem f : items) {
            if (!f.isAvailable() || !f.reduceStock()) {
                throw new RuntimeException(f.name + " is out of stock");
            }

            double discountedPrice = f.getPrice() - (f.getPrice() * f.getDiscount());

            System.out.println(f.name + " (" + f.category + ") : ₹" + discountedPrice);
        }

        calculateTotal();

        System.out.println("---------------------");
        System.out.println("Total Bill = ₹" + total);
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled. No refund policy.");
    }
}
