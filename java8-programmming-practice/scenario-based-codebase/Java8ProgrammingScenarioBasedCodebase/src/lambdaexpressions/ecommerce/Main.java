package lambdaexpressions.ecommerce;

/*Scenario 3: Shopping / E-Commerce

1.Use lambda to apply 10% discount on product price.

2.Sort products by price using lambda.

3.Use lambda to check free delivery eligibility (amount > 500).

4.Use lambda to calculate final bill amount.

5.Use lambda to print product names.*/

import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Chocolate", 20.50));
		products.add(new Product("Biscuit", 10));
		products.add(new Product("Cold Drink", 40));
		
		// Use lambda to apply 10% discount on product price
		System.out.println("Applying 10% Discount");
		products.forEach(p -> p.setPrice(p.getPrice()*0.90));
		products.forEach(System.out::println);
		
		// Sort products by price using lambda.
		System.out.println("\nSort products by price");
		products.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
		products.forEach(System.out::println);
		
        // check free delivery eligibility
		double total = products.stream().mapToDouble(Product::getPrice).sum();
		if(total > 500) System.out.println("Free Delivery");
		else System.out.println("Not Free Delivery");
		
		// Use lambda to calculate final bill amount.
		System.out.println("\nFinal Bill Amount");
        System.out.println("Total Bill: " + total);

        // Use lambda to print product names. 
        System.out.println("\nProduct Names");
        products.forEach(p ->System.out.println(p.getName()));
	}
}
