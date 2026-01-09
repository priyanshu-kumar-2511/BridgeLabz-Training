package digitalartmarketplace;

public class User {
	private String name;
	private double walletBalance;
	
	public User(String name, double walletBalance) {
		this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public boolean detuct(double amount) {
		if(walletBalance < amount ) {
			return false;
		} else {
		walletBalance -= amount;
		return true;
		}
	}
	
	public double getBalance() {
		return walletBalance;
	}
	
	public String getName() {
		return name;
	}
}
