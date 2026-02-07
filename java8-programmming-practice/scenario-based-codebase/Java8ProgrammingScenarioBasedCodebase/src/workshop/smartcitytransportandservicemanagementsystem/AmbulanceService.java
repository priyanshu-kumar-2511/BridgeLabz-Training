package workshop.smartcitytransportandservicemanagementsystem;

import java.time.LocalTime;

public class AmbulanceService implements TransportService, EmergencyService {

    private String route;
    private LocalTime departureTime;

    public AmbulanceService(String route,
                            LocalTime departureTime) {
        this.route = route;
        this.departureTime = departureTime;
    }

    public String getServiceName() { return "Ambulance"; }
    public String getRoute() { return route; }
    public double getFare() { return 0; }
    public LocalTime getDepartureTime() { return departureTime; }
}
