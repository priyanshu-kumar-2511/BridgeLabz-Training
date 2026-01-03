package vehiclerentalapplication;

public class Truck extends Vehicle {

    public Truck(String id, String brand) {
        super(id, brand, 2500);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + 1000;  // heavy vehicle surcharge
    }
}

