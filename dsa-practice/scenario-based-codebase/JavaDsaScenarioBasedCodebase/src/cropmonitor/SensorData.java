package cropmonitor;

public class SensorData {
    long timestamp;   
    double temperature;

    public SensorData(long timestamp, double temperature) {
        this.timestamp = timestamp;
        this.temperature = temperature;
    }
}
