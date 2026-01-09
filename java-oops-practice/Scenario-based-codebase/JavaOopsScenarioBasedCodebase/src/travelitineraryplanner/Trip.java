package travelitineraryplanner;

public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration;

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    protected double totalBudget;

    public Trip(String destination, int duration, Transport transport, Hotel hotel, Activity activity) {
        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        this.totalBudget = transport.getCost() + hotel.getCost() + activity.getCost();   
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
