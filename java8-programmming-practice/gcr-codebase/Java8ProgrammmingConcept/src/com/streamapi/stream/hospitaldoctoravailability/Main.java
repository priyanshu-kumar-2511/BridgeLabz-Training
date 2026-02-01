package com.streamapi.stream.hospitaldoctoravailability;

/*2. Hospital Doctor Availability
○ Scenario: Find doctors available on weekends and sort by specialty.
○ Task: Use streams with filter() and sorted().*/

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Sharma", "Cardiology", true),
                new Doctor("Dr. Mehta", "Orthopedics", false),
                new Doctor("Dr. Iyer", "Neurology", true),
                new Doctor("Dr. Khan", "Dermatology", true),
                new Doctor("Dr. Roy", "Cardiology", false)
        );

        List<Doctor> weekendDoctors = doctors.stream()

                // filter weekend availability
                .filter(Doctor::isAvailableOnWeekend)

                // sort by specialty, then by name
                .sorted(Comparator.comparing(Doctor::getSpecialty).thenComparing(Doctor::getName))
                .collect(Collectors.toList());

        weekendDoctors.forEach(System.out::println);
    }
}
