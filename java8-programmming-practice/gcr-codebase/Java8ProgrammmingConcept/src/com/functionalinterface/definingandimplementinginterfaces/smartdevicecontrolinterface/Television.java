package com.functionalinterface.definingandimplementinginterfaces.smartdevicecontrolinterface;

public class Television implements SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("Television is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Television is turned OFF.");
    }
}