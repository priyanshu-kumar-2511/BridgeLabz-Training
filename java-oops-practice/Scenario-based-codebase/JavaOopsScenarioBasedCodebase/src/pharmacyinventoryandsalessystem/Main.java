package pharmacyinventoryandsalessystem;

/*17. "MediStore – Pharmacy Inventory & Sales System"
Story: A pharmacy chain needs an app to manage drug inventory, sales, and expiry tracking.
Requirements:
● Medicine class: name, price, expiryDate, quantity.
● Interface ISellable with sell() and checkExpiry() methods.
● Constructors for medicines with default quantity.
● Use operators: total price, discount, stock adjustments.
● Encapsulation: internal stock and cost details are hidden.
● Inheritance: Tablet, Syrup, Injection extend Medicine.
● Polymorphism: checkExpiry() works differently for preserved vs liquid meds.
● Access Modifiers: make sensitive pricing logic private.*/

import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {

        ISellable t = new Tablet("Paracetamol", 5, LocalDate.of(2026, 3, 1), 50);
        ISellable s = new Syrup("Cough Syrup", 80, LocalDate.of(2026, 2, 10), 20);
        ISellable i = new Injection("Insulin", 300, LocalDate.of(2026, 12, 31), 10);

        System.out.println("Tablet Bill: " + t.sell(12));
        System.out.println("Syrup Bill: " + s.sell(2));
        System.out.println("Injection Bill: " + i.sell(1));
    }
}
