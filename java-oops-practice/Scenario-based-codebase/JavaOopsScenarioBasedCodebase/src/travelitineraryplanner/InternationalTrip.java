package travelitineraryplanner;

public class InternationalTrip extends Trip {
    public InternationalTrip(String dest, int days, Transport transport, Hotel hotel, Activity activity) {
        super(dest, days, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("International trip booked to " + destination + " for ₹" + (totalBudget + 10000)); 
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled. 15% fee applied.");
        double refund = totalBudget - 0.15*totalBudget;
        System.out.println("Total Refund amount : " + refund);
    }
}

