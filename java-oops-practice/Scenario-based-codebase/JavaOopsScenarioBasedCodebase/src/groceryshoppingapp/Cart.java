package groceryshoppingapp;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products = new ArrayList<>();
    private double totalPrice;

    // Constructor – empty cart
    public Cart() {}

    // Constructor – pre-filled cart
    public Cart(ArrayList<Product> items) {
        this.products = items;
        calculateTotal();
    }

    public void addProduct(Product p, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(p);
        }
        calculateTotal();
    }

    // Only Cart can modify totalPrice
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.getPrice();
        }
    }

    @Override
    public void applyDiscount(double coupon) {
        double productDiscount = 0;

        for (Product p : products) {
            productDiscount += p.getPrice() * p.getDiscountRate();
        }

        // Operators used
        totalPrice = totalPrice - productDiscount - coupon;
    }

    @Override
    public void generateBill() {
        System.out.println("------ SwiftCart Bill ------");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Payable: ₹" + totalPrice);
    }
}
