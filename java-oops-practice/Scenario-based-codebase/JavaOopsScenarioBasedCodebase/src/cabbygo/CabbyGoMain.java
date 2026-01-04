package cabbygo;

/*6. "CabbyGo – A Ride-Hailing App in the Making"
Story: You’ve joined a startup building CabbyGo, a ride-hailing app. You're tasked with building
the backend logic for managing vehicles, drivers, and ride booking.
Requirements:
● Vehicle (class): fields like vehicleNumber, capacity, type.
● Driver (class): fields like name, licenseNumber, rating.
● Constructors to initialize vehicles and drivers.
● An IRideService interface with methods like bookRide() and endRide().
● Use encapsulation to hide sensitive data like location, fare.
● Implement polymorphism with different vehicle types like Mini, Sedan, SUV (all extend
Vehicle).

● Use operators to calculate fare: baseFare + distance * rate.
● Apply access modifiers carefully: private for rating and fare, public methods to
read data.
*/

public class CabbyGoMain {
    public static void main(String[] args) {

        Driver d1 = new Driver("Rahul", "DL1234", 4.8);

        Vehicle v1 = new Sedan("KA09AB1234");  // Polymorphism

        IRideService ride = new RideService();

        ride.bookRide(d1, v1, 10);   // 10 km
        ride.endRide();
    }
}

