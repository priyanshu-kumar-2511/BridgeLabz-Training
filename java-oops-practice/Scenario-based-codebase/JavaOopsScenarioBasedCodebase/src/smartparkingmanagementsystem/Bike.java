package smartparkingmanagementsystem;

public class Bike extends Vehicle {
	public Bike(String number) {
		super(number, 20);
	}
	public double calculateCharges(int hours) {
		return baseRate * hours;
	}
}
