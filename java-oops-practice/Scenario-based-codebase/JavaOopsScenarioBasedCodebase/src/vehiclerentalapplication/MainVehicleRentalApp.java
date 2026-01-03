package vehiclerentalapplication;

/*2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer

Scenario-based Problems
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)
● OOP:
○ Abstraction: Rentable abstracts rental behavior
○ Inheritance: Car, Bike, Truck inherit from Vehicle
○ Polymorphism: Rent calculation differs by vehicle type
○ Encapsulation: All fields hidden behind getters/setters
*/

public class MainVehicleRentalApp {
    public static void main(String[] args) {

        Vehicle bike = new Bike("B101", "Yamaha");
        Vehicle car = new Car("C202", "Honda");
        Vehicle truck = new Truck("T303", "Tata");

        Customer priyanshu = new Customer("Priyanshu");

        priyanshu.rentVehicle(bike, 3);
        priyanshu.rentVehicle(car, 2);
        priyanshu.rentVehicle(truck, 1);
    }
}
