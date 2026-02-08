package optionalclass.ecommercesystem;

import java.util.Optional;

public class Product {

    private String name;
    private Double price;
    private Double discount; 
    private String description; 
    private Seller seller; 
    private Coupon coupon; 
    private DeliveryPartner deliveryPartner; 

    public Product(String name, Double price, Double discount, String description, Seller seller, Coupon coupon, DeliveryPartner deliveryPartner) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.seller = seller;
        this.coupon = coupon;
        this.deliveryPartner = deliveryPartner;
    }

    public String getName() { return name; }

    public Double getPrice() { return price; }

    public Optional<Double> getDiscount() {
        return Optional.ofNullable(discount);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }

    public Optional<Seller> getSeller() {
        return Optional.ofNullable(seller);
    }

    public Optional<Coupon> getCoupon() {
        return Optional.ofNullable(coupon);
    }

    public Optional<DeliveryPartner> getDeliveryPartner() {
        return Optional.ofNullable(deliveryPartner);
    }
}
