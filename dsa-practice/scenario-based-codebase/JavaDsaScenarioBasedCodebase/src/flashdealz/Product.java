package flashdealz;

public class Product {
	private String name;
	private double discount;
	
	public Product(String name, double discount) {
		this.name = name;
		this.discount = discount;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " | Discount: "+ discount + "%";
	}
}
