package travellog;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    private String country;
    private List<String> cities;
    private LocalDate startDate;
    private LocalDate endDate;
    private String notes;

    public Trip(String country, List<String> cities,
                LocalDate startDate, LocalDate endDate,
                String notes) {

        this.country = country;
        this.cities = cities;
        this.startDate = startDate;
        this.endDate = endDate;
        this.notes = notes;
    }

    public String getCountry() {
        return country;
    }

    public List<String> getCities() {
        return cities;
    }

    public long getDurationDays() {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Country: " + country +
                ", Cities: " + cities +
                ", Duration: " + getDurationDays() + " days";
    }
}
