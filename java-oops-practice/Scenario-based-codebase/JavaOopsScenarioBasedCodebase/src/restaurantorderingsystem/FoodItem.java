package restaurantorderingsystem;

public abstract class FoodItem implements IOrderable {
	protected String name;
	protected String category;
	protected double price;
	private int stock;
	
	public FoodItem(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock; 
	}
	
	public boolean isAvailable() {
		return stock > 0;
	}
	
	protected boolean reduceStock() {
		if(stock <=0) {
			return false;
		} else {
			stock --;
			return true;
		}
	}
	
	public double getPrice() {
		return price;
	}
	
	public abstract double getDiscount();
	
}
