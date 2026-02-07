package workshop.smartcitytransportandservicemanagementsystem;

import java.time.LocalTime;

public class TaxiService implements TransportService {

    private String route;
    private double fare;
    private LocalTime departureTime;

    public TaxiService(String route, double fare,
                       LocalTime departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Taxi"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departureTime; }
}
