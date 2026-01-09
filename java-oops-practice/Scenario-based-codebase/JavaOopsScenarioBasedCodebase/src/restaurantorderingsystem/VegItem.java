package restaurantorderingsystem;

public class VegItem extends FoodItem {

    public VegItem(String name, double price, int stock) {
        super(name, "Veg", price, stock);
    }
 
    void display() {
    	System.out.println("Item name: "+ name);
    	System.out.println("Price : "+ price);
    }
    @Override
    public double getDiscount() {
        return 0.10;   
    }
}
