package optionalclass.ecommercesystem;

public class DeliveryPartner {

    private String name;
    private String trackingSupport;

    public DeliveryPartner(String name, String trackingSupport) {
        this.name = name;
        this.trackingSupport = trackingSupport;
    }

    public String getName() { return name; }

    public String getTrackingSupport() {
        return trackingSupport;
    }
}
