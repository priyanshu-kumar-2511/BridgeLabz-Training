package com.streamapi.stream.filteringexpiringmemberships;

/*4. Filtering Expiring Memberships
Given a list of gym members with their membership expiry dates, use Stream API to filter
out members whose membership expires within the next 30 days.*/

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<GymMember> members = Arrays.asList(
                new GymMember("Ravi", LocalDate.now().plusDays(10)),
                new GymMember("Anita", LocalDate.now().plusDays(40)),
                new GymMember("Karan", LocalDate.now().plusDays(25)),
                new GymMember("Meera", LocalDate.now().minusDays(5))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        List<GymMember> expiringSoon = members.stream()

                .filter(member ->member.getExpiryDate().isAfter(today.minusDays(1)) &&
                                 member.getExpiryDate().isBefore(next30Days.plusDays(1)))
                .collect(Collectors.toList());

        expiringSoon.forEach(System.out::println);
    }
}
