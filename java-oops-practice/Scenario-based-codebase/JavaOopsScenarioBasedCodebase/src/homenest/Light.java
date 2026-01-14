package homenest;

public class Light extends Device {

    public Light(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        addEnergy(1.5);
        System.out.println("Light ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF");
    }

    public void reset() {
        System.out.println("Light reset to default brightness");
    }
}

