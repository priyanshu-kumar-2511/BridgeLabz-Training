package medwarehouse;

import java.time.LocalDate;

public class Medicine {
	private String name;
	private LocalDate expiryDate;
	
	public Medicine(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	public LocalDate getExpiryDate(){
		return expiryDate;
	}
	
	public String toString() {
		return "Medicine name: "+name+" | Expiry Date: "+expiryDate; 
	}
}
