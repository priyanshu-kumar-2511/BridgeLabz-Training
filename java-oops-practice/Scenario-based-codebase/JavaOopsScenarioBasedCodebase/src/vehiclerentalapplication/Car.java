package vehiclerentalapplication;

public class Car extends Vehicle {

    public Car(String id, String brand) {
        super(id, brand, 1000);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days + 500;  // insurance charge
    }
}

