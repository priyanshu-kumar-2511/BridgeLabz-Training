package com.functionalinterface.staticmethodsininterfaces.dateformatutility;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public interface DateUtils {

    static String formatDate(LocalDate date, String pattern) {

        if (date == null || pattern == null) {
            throw new IllegalArgumentException("Date and pattern cannot be null");
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    // Common predefined formats
    static String formatAsInvoice(LocalDate date) {
        return formatDate(date, "dd-MM-yyyy");
    }

    static String formatAsUS(LocalDate date) {
        return formatDate(date, "MM/dd/yyyy");
    }

    static String formatAsISO(LocalDate date) {
        return date.toString(); // ISO default
    }
}
