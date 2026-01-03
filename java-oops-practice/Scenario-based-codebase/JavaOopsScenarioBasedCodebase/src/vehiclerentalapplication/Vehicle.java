package vehiclerentalapplication;

public abstract class Vehicle implements Rentable {

    protected String vehicleId;      // subclasses can access
    protected String brand;
    protected double baseRate;       // per day

    private boolean available = true;   // encapsulated

    public Vehicle(String id, String brand, double rate) {
        this.vehicleId = id;
        this.brand = brand;
        this.baseRate = rate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rentOut() {
        available = false;
    }

    public void returnVehicle() {
        available = true;
    }

    public String getDetails() {
        return vehicleId + " | " + brand + " | Rate/day: ₹" + baseRate;
    }
}
