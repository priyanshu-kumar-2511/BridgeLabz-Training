package smarthomeautomationsystem;

public abstract class Appliance implements Controllable {

    private String deviceId;
    private boolean isOn;        // internal state (encapsulated)
    private int powerUsage;     // watts

    public Appliance(String id, int powerUsage) {
        this.deviceId = id;
        this.powerUsage = powerUsage;
    }

    protected int getPowerUsage() {
        return powerUsage;
    }

    protected void setPowerUsage(int powerUsage) {
        this.powerUsage = powerUsage;
    }

    public String getStatus() {
        return deviceId + " is " + (isOn ? "ON" : "OFF");
    }

    protected void setState(boolean state) {
        isOn = state;
    }

    public boolean isOn() {
        return isOn;
    }
}
