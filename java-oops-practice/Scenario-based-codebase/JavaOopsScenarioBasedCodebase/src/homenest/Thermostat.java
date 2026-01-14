package homenest;

public class Thermostat extends Device {

    public Thermostat(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        addEnergy(5.0);
        System.out.println("Thermostat ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF");
    }

    public void reset() {
        System.out.println("Temperature settings reset");
    }
}

