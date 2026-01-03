package vehiclerentalapplication;

public class Bike extends Vehicle {

    public Bike(String id, String brand) {
        super(id, brand, 300);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;   // no surcharge
    }
}
