package workshop.smartcitytransportandservicemanagementsystem;

import java.time.LocalTime;

public class MetroService implements TransportService {

    private String route;
    private double fare;
    private LocalTime departureTime;

    public MetroService(String route, double fare,
                        LocalTime departureTime) {
        this.route = route;
        this.fare = fare;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Metro"; }
    public String getRoute() { return route; }
    public double getFare() { return fare; }
    public LocalTime getDepartureTime() { return departureTime; }
}
