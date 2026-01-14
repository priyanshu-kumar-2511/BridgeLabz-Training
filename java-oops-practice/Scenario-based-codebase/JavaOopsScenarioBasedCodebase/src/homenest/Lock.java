package homenest;

public class Lock extends Device {

    public Lock(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        addEnergy(0.5);
        System.out.println("Lock engaged");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Lock disengaged");
    }

    public void reset() {
        System.out.println("Lock security keys refreshed");
    }
}

