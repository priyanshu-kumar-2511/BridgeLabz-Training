package com.functionalinterface.definingandimplementinginterfaces.smartdevicecontrolinterface;

/*1. Smart Device Control Interface
○ Scenario: All devices (lights, AC, TV) should have turnOn() and turnOff()
methods.
○ Task: Create an interface and implement it in multiple classes.*/

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SmartDevice> devices = Arrays.asList(
                new Light(),
                new AirConditioner(),
                new Television()
        );

        // Turn all devices ON
        for (SmartDevice device : devices) {
            device.turnOn();
        }

        System.out.println();

        // Turn all devices OFF
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }
}
