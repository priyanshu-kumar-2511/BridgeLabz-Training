package optionalclass.ecommercesystem;

public class EcommerceService {

    /* 1️ Apply default discount if not present */
    public double calculateFinalPrice(Product product) {

        double discount = product.getDiscount().orElse(5.0); 
        return product.getPrice() -(product.getPrice() * discount / 100);
    }

    /* 2️ Fetch coupon if present */
    public void applyCoupon(Product product) {

        product.getCoupon().ifPresent(coupon -> {System.out.println("Applying Coupon: "+ coupon.getCode());});
    }

    /* 3️ Display seller safely */
    public String getSellerDetails(Product product) {

        return product.getSeller().map(s -> s.getName() + " (Contact: "+ s.getContact() + ")").orElse("Seller details not available");
    }

    /* 4️ Safe product description */
    public String getDescription(Product product) {

        return product.getDescription().orElse("No description available");
    }

    /* 5️ Fetch delivery partner */
    public String getDeliveryInfo(Product product) {

        return product.getDeliveryPartner().map(d -> d.getName() +" - " + d.getTrackingSupport()).orElse("Delivery partner not assigned");
    }
}
