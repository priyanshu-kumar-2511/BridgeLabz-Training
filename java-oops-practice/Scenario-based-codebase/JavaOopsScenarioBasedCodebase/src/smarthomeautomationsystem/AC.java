package smarthomeautomationsystem;

public class AC extends Appliance {

    public AC(String id) {
        super(id, 1500);   // high power
    }

    @Override
    public void turnOn() {
        setState(true);
        System.out.println("AC ON (Cooling mode, " + getPowerUsage() + "W)");
    }

    @Override
    public void turnOff() {
        setState(false);
        System.out.println("AC OFF");
    }
}
