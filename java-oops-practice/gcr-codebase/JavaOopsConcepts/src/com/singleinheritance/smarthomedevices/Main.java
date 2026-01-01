package com.singleinheritance.smarthomedevices;

public class Main {
    public static void main(String[] args) {

        Device d1 = new Thermostat("T1001", "ON", 24);
        d1.displayStatus();
    }
}
