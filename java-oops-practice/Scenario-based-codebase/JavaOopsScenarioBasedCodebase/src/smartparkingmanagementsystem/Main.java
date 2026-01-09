package smartparkingmanagementsystem;

/*16. "ParkEase – Smart Parking Management System"
Story: A city wants a smart parking solution that can assign parking slots, calculate charges,
and track availability in real time.
Requirements:
● ParkingSlot class: slotId, isOccupied, vehicleTypeAllowed.
● Vehicle base class → Car, Bike, Truck subclasses.
● IPayable interface with calculateCharges(duration) method.
● Encapsulation: Slot availability shouldn't be altered externally.
● Use constructors for slot initialization with location, vehicle type.
● Operators: (baseRate × hours) + (penalty if over time).
● Polymorphism: calculateCharges() differs by vehicle type.
● Access Modifiers: internal booking records are private, exposed via logs.*/

public class Main {
    public static void main(String[] args) {

        ParkingSlot carSlot = new ParkingSlot(1, "Mall", "Car");
        ParkingSlot bikeSlot = new ParkingSlot(2, "Mall", "Bike");
        ParkingSlot truckSlot = new ParkingSlot(3, "Warehouse", "Truck");

        Vehicle truck = new Truck("TRK303");
        Vehicle car = new Car("CAR101");
        Vehicle bike = new Bike("BIKE202");

        ParkingManager manager = new ParkingManager();

        manager.park(carSlot, car);
        manager.unpark(carSlot, 3);

        manager.park(bikeSlot, bike);
        manager.unpark(bikeSlot, 2);
        
        manager.park(truckSlot, truck);
        manager.unpark(truckSlot, 7); 
        
        manager.showLogs();
    }
}
