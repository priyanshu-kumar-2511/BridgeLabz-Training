package cabbygo;

public abstract class Vehicle {

    private String vehicleNumber;
    private int capacity;
    private String type;

    protected double ratePerKm;   // used by child classes

    public Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    // Polymorphic method
    public double calculateFare(double baseFare, double distance) {
        return baseFare + (distance * ratePerKm);
    }
}
