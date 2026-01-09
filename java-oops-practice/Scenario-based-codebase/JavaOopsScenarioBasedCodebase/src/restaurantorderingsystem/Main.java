package restaurantorderingsystem;

/*20. "FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.*/

public class Main {
	public static void main(String[] args) {
		
		FoodItem pizza = new VegItem("Paneer Pizza", 300, 5);
        FoodItem burger = new NonVegItem("Chicken Burger", 200, 5);
        FoodItem salad = new VegItem("Salad", 100, 5);

        Order combo = new Order(pizza, burger, salad);   

        combo.placeOrder();
    }
	
}
