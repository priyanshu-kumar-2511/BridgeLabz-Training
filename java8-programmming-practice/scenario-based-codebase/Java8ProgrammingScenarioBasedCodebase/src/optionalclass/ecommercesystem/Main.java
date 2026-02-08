package optionalclass.ecommercesystem;

/*Scenario 4: 
1.E-Commerce System: A product may not have a discount. Use Optional to apply default discount.
2.Fetch coupon code if present, otherwise skip discount logic.
3.Display seller details safely using Optional.
4.If product description is missing, return “No description available”.
5.Fetch delivery partner info using Optional.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Seller seller = new Seller("PK Store", "6207394439");
        Coupon coupon = new Coupon("SAVE10", 10);

        DeliveryPartner delivery = new DeliveryPartner("Ekart Express","Live Tracking Available");

        Product product1 = new Product("Laptop", 60000.0, null, null, seller, coupon, delivery);
        Product product2 = new Product("Mobile", 25000.0, 8.0, "Latest smartphone", null, null, null);

        List<Product> products = Arrays.asList(product1, product2);

        EcommerceService service = new EcommerceService();

        System.out.println("=== Product Details ===\n");
        
        for (Product product : products) {
        	
        System.out.println("Product: " + product.getName());
        System.out.println("Final Price: Rs" + service.calculateFinalPrice(product));
        service.applyCoupon(product);
        System.out.println("Seller: " + service.getSellerDetails(product));
        System.out.println("Description: " + service.getDescription(product));
        System.out.println("Delivery: " + service.getDeliveryInfo(product));
        System.out.println("\n------------------------\n");
        }
    }
}
