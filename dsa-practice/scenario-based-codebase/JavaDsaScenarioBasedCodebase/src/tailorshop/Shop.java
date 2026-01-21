package tailorshop;

import java.time.*;

public class Shop {
	String orderID;
	LocalDate deliveryDate;
	
	public Shop(String orderID, LocalDate deliveryDate) {
		this.orderID = orderID;
		this.deliveryDate = deliveryDate;
	}
	
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	
	public String toString() {
        return "Order ID: " + orderID + " | Delivery Deadline: " + deliveryDate;
    }
}
