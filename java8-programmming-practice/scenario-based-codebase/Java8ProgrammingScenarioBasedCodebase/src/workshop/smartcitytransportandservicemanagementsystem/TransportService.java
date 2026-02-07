package workshop.smartcitytransportandservicemanagementsystem;
import java.time.LocalTime;

public interface TransportService {

    String getServiceName();
    String getRoute();
    double getFare();
    LocalTime getDepartureTime();

    default void printServiceDetails() {
        System.out.println(getServiceName() + " | Route: " + getRoute() + " | Fare: ₹" + getFare() + " | Departure: " + getDepartureTime());
    }
}
