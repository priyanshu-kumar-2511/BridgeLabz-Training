package cabbygo;

public class RideService implements IRideService {

    private double fare;   // sensitive
    private boolean rideActive;

    private static final double BASE_FARE = 50;

    @Override
    public void bookRide(Driver driver, Vehicle vehicle, double distance) {
        fare = vehicle.calculateFare(BASE_FARE, distance);
        rideActive = true;

        System.out.println("Driver: " + driver.getName());
        System.out.println("Vehicle: " + vehicle.getType());
        System.out.println("Ride Started...");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        if (rideActive) {
            System.out.println("Ride Ended. Final Fare: ₹" + fare);
            rideActive = false;
        } else {
            System.out.println("No active ride.");
        }
    }

    public double getFare() {
        return fare;
    }
}

