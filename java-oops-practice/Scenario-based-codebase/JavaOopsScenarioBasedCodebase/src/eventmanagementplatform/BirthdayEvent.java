package eventmanagementplatform;

public class BirthdayEvent extends Event {

    public BirthdayEvent(String name, String location, String date, int attendees, User user) {
        super(name, location, date, attendees, user);
    }

    public BirthdayEvent(String name, String location, String date, int attendees, User user, double venue, double service, double discount) {
        super(name, location, date, attendees, user, venue, service, discount);
    }

    public void schedule() {
        System.out.println("Birthday party booked for " + date);
        System.out.println("Total cost: " + calculateCost());
    }

    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println("Birthday party rescheduled to " + newDate);
    }

    public void cancel() {
        System.out.println("Birthday party canceled.");
    }
}

