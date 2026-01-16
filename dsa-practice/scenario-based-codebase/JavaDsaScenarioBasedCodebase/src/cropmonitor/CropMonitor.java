package cropmonitor;

import java.util.*;

public class CropMonitor {

    private List<SensorData> dataList = new ArrayList<>();

    public void addSensorData(long timestamp, double temperature) {
        dataList.add(new SensorData(timestamp, temperature));
        System.out.println("🌡 Sensor data added");
    }

    public void sortByTimestamp() {
        if (dataList.size() <= 1) return;
        quickSort(0, dataList.size() - 1);
        System.out.println("📊 Sensor data sorted by timestamp");
    }

    // Quick Sort (in-place)
    private void quickSort(int low, int high) {
        if (low < high) {
            int p = partition(low, high);
            quickSort(low, p - 1);
            quickSort(p + 1, high);
        }
    }

    // Partition by timestamp
    private int partition(int low, int high) {
        long pivot = dataList.get(high).timestamp;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (dataList.get(j).timestamp <= pivot) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        SensorData temp = dataList.get(i);
        dataList.set(i, dataList.get(j));
        dataList.set(j, temp);
    }

    public void showData() {
        if (dataList.isEmpty()) {
            System.out.println("No sensor data available");
            return;
        }

        System.out.println("\nSensor Readings (Old → New):");
        for (SensorData d : dataList) {
            System.out.println("Time: " + d.timestamp + " | Temp: " + d.temperature + "°C");
        }
    }
}
