package vehiclerentalapplication;

public class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void rentVehicle(Vehicle v, int days) {
        if (!v.isAvailable()) {
            System.out.println("Vehicle not available");
            return;
        }

        double cost = v.calculateRent(days);
        v.rentOut();

        System.out.println(name + " rented " + v.getDetails());
        System.out.println("Total cost for " + days + " days = ₹" + cost);
    }
}

