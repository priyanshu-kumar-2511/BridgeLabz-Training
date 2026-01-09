package smartparkingmanagementsystem;

public class Car extends Vehicle {
	public Car(String number) {
		super(number, 50);
	}
	
	public double calculateCharges(int hours) {
		return baseRate * hours;
	}
}
