package homenest;

public abstract class Device implements IControllable {

    private String deviceId;
    private boolean status;          // ON / OFF
    private double energyUsage;      // kWh
    private final String firmwareLog;   // protected from outside

    public Device(String deviceId) {
        this.deviceId = deviceId;
        this.status = false;
        this.energyUsage = 0;
        this.firmwareLog = "Firmware v1.0";
    }

    protected void addEnergy(double units) {
        energyUsage += units;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    protected void setStatus(boolean value) {
        status = value;     // only subclasses can change
    }

    public boolean isOn() {
        return status;
    }
}

