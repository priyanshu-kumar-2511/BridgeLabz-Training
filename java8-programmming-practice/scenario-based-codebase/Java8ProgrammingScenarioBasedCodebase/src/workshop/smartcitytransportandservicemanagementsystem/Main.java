package workshop.smartcitytransportandservicemanagementsystem;

// https://classroom.google.com/w/ODIxNjE3NTg5MDE1/t/all

import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList( new BusService("A-B", 40,LocalTime.of(9, 30)), 
        		        new MetroService("B-C", 25, LocalTime.of(9, 15)),
        		        new TaxiService("A-C", 80, LocalTime.of(9, 45)),
        		        new AmbulanceService("Emergency Route", LocalTime.of(9, 10))
        );

        System.out.println("=== All Services (Dashboard) ===");
        services.forEach(TransportService::printServiceDetails);

        System.out.println("\n=== Cheapest Services First ===");

        services.stream().filter(s -> s.getFare() > 0).sorted(Comparator.comparing( TransportService::getFare)).forEach(TransportService::printServiceDetails);

        FareCalculator calculator =(distance, rate) -> distance * rate;

        double distance = GeoUtils.calculateDistance(1,2,4,6);
        double calculatedFare = calculator.calculateFare(distance, 10);

        System.out.println("\nDistance: " + distance);
        System.out.println("Calculated Taxi Fare: ₹" + calculatedFare);

        List<Passenger> passengers = Arrays.asList(
                new Passenger("Rahul", "A-B", 40, true),
                new Passenger("Priya", "A-B", 40, false),
                new Passenger("Amit", "B-C", 25, true),
                new Passenger("Sneha", "A-C", 80, false),
                new Passenger("Rohit", "B-C", 25, true)
        );

        Map<String, List<Passenger>> grouped =passengers.stream().collect(Collectors.groupingBy(Passenger::getRoute));

        System.out.println("\n=== Grouped by Route ===");
        grouped.forEach((route, list) -> System.out.println(route + " -> " + list.size() + " passengers"));

        Map<Boolean, List<Passenger>> partitioned = passengers.stream().collect(Collectors.partitioningBy(Passenger::isPeakTime));

        System.out.println("\nPeak Trips: " + partitioned.get(true).size());
        System.out.println("Non-Peak Trips: " + partitioned.get(false).size());

        DoubleSummaryStatistics stats = passengers.stream().collect(Collectors.summarizingDouble(Passenger::getFare));

        System.out.println("\n=== Revenue Report ===");
        System.out.println("Total Revenue: ₹" + stats.getSum());
        System.out.println("Average Fare: ₹" + stats.getAverage());

        System.out.println("\n=== Emergency Services ===");

        services.stream().filter(s -> s instanceof EmergencyService).forEach(s ->System.out.println("Priority Access: " + s.getServiceName()));
    }
}