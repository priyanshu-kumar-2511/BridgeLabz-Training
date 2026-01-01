package com.singleinheritance.smarthomedevices;

public class Device {
    String deviceId;
    String status;   // ON or OFF

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status   : " + status);
    }
}

