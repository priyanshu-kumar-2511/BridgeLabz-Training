package travelitineraryplanner;

/*18. "TourMate – Travel Itinerary Planner"
Story: TourMate helps travelers plan and book trips by organizing activities, transportation, and
stays.
Requirements :
● Trip class: destination, budget, duration.
● Transport, Hotel, Activity are associated.
● Interface IBookable with book() and cancel() methods.
● Encapsulation: hide cost breakdown inside services.
● Use constructors to generate complete trip packages.
● Operators: total budget = hotel + transport + activities.
● Inheritance: InternationalTrip, DomesticTrip extend Trip.
● Polymorphism: book() logic differs based on trip type.*/

public class Main {
    public static void main(String[] args) {

        Transport flight = new Transport(15000);
        Hotel hotel = new Hotel(10000);
        Activity activity = new Activity(3000);

        Trip trip1 = new DomesticTrip("Goa", 5, flight, hotel, activity);
        Trip trip2 = new InternationalTrip("Paris", 7, flight, hotel, activity);

        trip1.book();
        System.out.println("");
        trip2.book();
        
        System.out.println("");
        trip1.cancel();
        System.out.println("");
        trip2.cancel();
    }
}
