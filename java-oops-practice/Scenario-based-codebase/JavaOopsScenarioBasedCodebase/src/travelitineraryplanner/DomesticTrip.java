package travelitineraryplanner;

public class DomesticTrip extends Trip {
    public DomesticTrip(String dest, int days, Transport transport, Hotel hotel, Activity activity) {
        super(dest, days, transport, hotel, activity);
    }

    @Override
    public void book() {
        System.out.println("Domestic trip booked to " + destination + " for ₹" + totalBudget);
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled. 5% fee applied.");
        double refund = totalBudget - 0.05*totalBudget;
        System.out.println("Total Refund amount : " + refund);
    }
}
