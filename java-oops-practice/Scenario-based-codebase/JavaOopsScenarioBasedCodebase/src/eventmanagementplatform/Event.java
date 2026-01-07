package eventmanagementplatform;

import java.util.*;
public abstract class Event implements ISchedulable {

	private final String eventId;
	protected String eventName;
	protected String location;
	protected String date;
	protected int attendees;
	protected User organizer;
	
	private double venueCost;
	private double serviceCost;
	private double discount;
	
	public Event(String eventName, String location, String date, int attendees, User organizer) {
		this.eventId = UUID.randomUUID().toString();
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.organizer = organizer;
	}
	
    public Event(String eventName, String location, String date, int attendees, User organizer,double venueCost, double serviceCost, double discount) {
        this(eventName, location, date, attendees, organizer);
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }
    
    public String getEventId() {
        return eventId;
    }

    protected double calculateCost() {
        return venueCost + serviceCost - discount;
    }

    public void setServices(double venueCost, double serviceCost, double discount) {
        this.venueCost = venueCost;
        this.serviceCost = serviceCost;
        this.discount = discount;
    }
}
