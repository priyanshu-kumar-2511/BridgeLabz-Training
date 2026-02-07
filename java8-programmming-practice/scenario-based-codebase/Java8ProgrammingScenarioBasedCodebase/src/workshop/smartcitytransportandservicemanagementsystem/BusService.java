package workshop.smartcitytransportandservicemanagementsystem;

import java.time.LocalTime;

public class BusService implements TransportService {

    private String route;
    private double fare;
    private LocalTime departureTime;

    public BusService(String route, double fare, LocalTime departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Bus"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departureTime; }
}
