package smarthomeautomationsystem;

import java.util.*;

public class UserController {

    public void controlDevice(Appliance a, boolean turnOn) {
        if (turnOn)
            a.turnOn();
        else
            a.turnOff();
    }

    public void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getPowerUsage() > a2.getPowerUsage())
            System.out.println("Device 1 uses more power");
        else if (a1.getPowerUsage() < a2.getPowerUsage())
            System.out.println("Device 2 uses more power");
        else
            System.out.println("Both use equal power");
    }
}

