package com.functionalinterface.staticmethodsininterfaces.unitconversiontool;

public interface UnitConverter {

    // 1 kilometer = 0.621371 miles
    static double kmToMiles(double km) {
        return km * 0.621371;
    }

    static double milesToKm(double miles) {
        return miles / 0.621371;
    }

    // 1 kilogram = 2.20462 pounds
    static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    static double lbsToKg(double lbs) {
        return lbs / 2.20462;
    }
}
