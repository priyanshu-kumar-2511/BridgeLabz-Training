package com.streamapi.stream.filteringexpiringmemberships;

import java.time.LocalDate;

public class GymMember {

    private String name;
    private LocalDate expiryDate;

    public GymMember(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}
