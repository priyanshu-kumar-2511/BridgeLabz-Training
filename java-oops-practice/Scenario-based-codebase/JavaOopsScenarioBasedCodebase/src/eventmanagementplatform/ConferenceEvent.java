package eventmanagementplatform;

public class ConferenceEvent extends Event {

    public ConferenceEvent(String name, String location, String date, int attendees, User user) {
        super(name, location, date, attendees, user);
    }

    public ConferenceEvent(String name, String location, String date, int attendees, User user, double venue, double service, double discount) {
        super(name, location, date, attendees, user, venue, service, discount);
    }

    public void schedule() {
        System.out.println("Conference scheduled for " + date);
        System.out.println("Attendees: " + attendees);
        System.out.println("Total cost: " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Conference moved to " + newDate);
    }

    public void cancel() {
        System.out.println("Conference canceled. Refund processing.");
    }
}
