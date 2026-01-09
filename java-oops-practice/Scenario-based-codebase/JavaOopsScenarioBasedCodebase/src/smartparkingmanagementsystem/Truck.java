package smartparkingmanagementsystem;

public class Truck extends Vehicle {
	public Truck(String number) {
		super(number, 200);
	}
	public double calculateCharges(int hours) {
		double amount = baseRate * hours;
		if(hours > 5) {
			amount += 200;
		}
		return amount;
	}
}
