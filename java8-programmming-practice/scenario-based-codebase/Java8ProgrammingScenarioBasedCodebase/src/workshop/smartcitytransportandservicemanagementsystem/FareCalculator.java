package workshop.smartcitytransportandservicemanagementsystem;

@FunctionalInterface
public interface FareCalculator {
    double calculateFare(double distance, double ratePerKm);
}
