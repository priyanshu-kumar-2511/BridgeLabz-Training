package homenest;

public class Camera extends Device {

    public Camera(String id) {
        super(id);
    }

    public void turnOn() {
        setStatus(true);
        addEnergy(3.0);
        System.out.println("Camera ON");
    }

    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF");
    }

    public void reset() {
        System.out.println("Camera recalibrated");
    }
}
