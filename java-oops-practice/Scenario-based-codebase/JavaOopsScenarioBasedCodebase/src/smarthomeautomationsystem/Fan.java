package smarthomeautomationsystem;

public class Fan extends Appliance {

    public Fan(String id) {
        super(id, 75);
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("Fan ON (Spinning at normal speed, " + getPowerUsage() + "W)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("Fan OFF");
    }
}
