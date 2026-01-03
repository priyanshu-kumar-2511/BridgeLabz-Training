package smarthomeautomationsystem;

public class Light extends Appliance {

    public Light(String id) {
        super(id, 60);  // default 60W
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Light ON (Soft lighting, " + getPowerUsage() + "W)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Light OFF");
    }
}
