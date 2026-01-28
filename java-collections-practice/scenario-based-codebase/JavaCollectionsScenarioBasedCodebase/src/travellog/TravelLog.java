package travellog;

/*2. TravelLog – Trip Organizer for Backpackers
Story: Ritika, a travel blogger, maintains a personal app called TravelLog where she stores all
her travel experiences.
Each trip is stored as a serialized object and saved to disk using ObjectOutputStream. She
wants to search all her entries to find:
● All cities she visited using regex over text
● Trip durations more than 5 days
● Unique countries visited (use Set)
● Top 3 cities she visited most often (use Map<City, Integer> and sort)
The system must support both reading/writing trip entries from files and summarizing them using
Java Collections.*/

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.regex.*;

public class TravelLog {

    private static final String FILE_NAME = "trips.dat";

    public static void main(String[] args) {

        // Create sample trips and save
        saveTrips(sampleTrips());

        // Load trips from file
        List<Trip> trips = loadTrips();

        if (trips == null || trips.isEmpty()) {
            System.out.println("No trips found.");
            return;
        }

        // Run analytics
        searchCitiesWithRegex(trips, "Paris|Rome");
        filterLongTrips(trips);
        printUniqueCountries(trips);
        printTop3Cities(trips);
    }

    // Save trips to disk
    private static void saveTrips(List<Trip> trips) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(trips);
            System.out.println("Trips saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving trips: " + e.getMessage());
        }
    }

    // Load trips from disk

    private static List<Trip> loadTrips() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            return (List<Trip>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading trips: " + e.getMessage());
        }
        return null;
    }

    // Regex search for cities

    private static void searchCitiesWithRegex(List<Trip> trips,
                                              String patternStr) {

        System.out.println("\nTrips matching city regex: " + patternStr);

        Pattern pattern = Pattern.compile(patternStr,
                Pattern.CASE_INSENSITIVE);

        for (Trip trip : trips) {
            for (String city : trip.getCities()) {
                if (pattern.matcher(city).find()) {
                    System.out.println(trip);
                    break;
                }
            }
        }
    }

    // Trips > 5 days

    private static void filterLongTrips(List<Trip> trips) {

        System.out.println("\nTrips longer than 5 days:");

        trips.stream()
                .filter(t -> t.getDurationDays() > 5)
                .forEach(System.out::println);
    }

    // Unique countries

    private static void printUniqueCountries(List<Trip> trips) {

        Set<String> countries = new HashSet<>();

        for (Trip trip : trips) {
            countries.add(trip.getCountry());
        }

        System.out.println("\nUnique Countries Visited:");
        countries.forEach(System.out::println);
    }

    // Top 3 most visited cities

    private static void printTop3Cities(List<Trip> trips) {

        Map<String, Integer> cityCount = new HashMap<>();

        for (Trip trip : trips) {
            for (String city : trip.getCities()) {
                cityCount.put(city,
                        cityCount.getOrDefault(city, 0) + 1);
            }
        }

        System.out.println("\nTop 3 Most Visited Cities:");

        cityCount.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3).forEach(e ->System.out.println(e.getKey() + " → " + e.getValue()));
    }

    // Sample Data

    private static List<Trip> sampleTrips() {

        return Arrays.asList(
                new Trip("France",
                        Arrays.asList("Paris", "Nice"),
                        java.time.LocalDate.of(2023, 5, 1),
                        java.time.LocalDate.of(2023, 5, 8),
                        "Amazing food and culture"),

                new Trip("Italy",
                        Arrays.asList("Rome", "Venice"),
                        java.time.LocalDate.of(2022, 6, 10),
                        java.time.LocalDate.of(2022, 6, 14),
                        "Historic sites"),

                new Trip("France",
                        Arrays.asList("Paris", "Lyon"),
                        java.time.LocalDate.of(2021, 7, 1),
                        java.time.LocalDate.of(2021, 7, 10),
                        "Summer vibes")
        );
    }
}
