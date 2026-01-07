package eventmanagementplatform;

/*13. "EventEase – Event Management Platform"
Story: EventEase helps users organize events like birthdays, weddings, and conferences.
You’re responsible for the booking and scheduling module.
Requirements:
● Event class: eventName, location, date, attendees.
● User class to represent the organizer.

Scenario-based Problems
● Constructors to create events with or without catering/decoration packages.
● ISchedulable interface with methods schedule(), reschedule(), cancel().
● Use access modifiers to restrict editing of eventId once assigned.
● Use operators to calculate costs (venue + services – discounts).
● Inheritance: BirthdayEvent, ConferenceEvent extend Event.
● Polymorphism: schedule() behaves differently based on event type.
● Apply encapsulation to protect pricing and sensitive user data.
*/

public class Main {
	public static void main(String[] args) {

        User user = new User("Priyanshu", "priyanshu@gmail.com", "9876543210");

        Event e1 = new BirthdayEvent("Riya's Birthday", "Delhi", "10-June", 50, user, 20000, 8000, 2000);
        Event e2 = new ConferenceEvent("Tech Summit", "Mumbai", "15-July", 300, user, 100000, 40000, 10000);

        e1.schedule();
        e2.schedule();
    }
}
