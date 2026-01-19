package fleetmanager;

import java.util.*;

public class FleetManager {

    // Public method to sort a depot list
    public List<Vehicle> sortDepot(List<Vehicle> depot) {
        if (depot.size() <= 1) return depot;
        return mergeSort(depot);
    }

    // Merge Sort
    private List<Vehicle> mergeSort(List<Vehicle> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;

        List<Vehicle> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Vehicle> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    // Merge two sorted lists
    private List<Vehicle> merge(List<Vehicle> a, List<Vehicle> b) {
        List<Vehicle> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).mileage <= b.get(j).mileage) {
                result.add(a.get(i++));
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    // Merge two depots AFTER sorting
    public List<Vehicle> createMasterSchedule(List<Vehicle> d1, List<Vehicle> d2) {
        List<Vehicle> sortedD1 = sortDepot(d1);
        List<Vehicle> sortedD2 = sortDepot(d2);
        return merge(sortedD1, sortedD2);
    }

    public void showSchedule(List<Vehicle> list) {
        System.out.println("\n🛠 Master Maintenance Schedule:");
        for (Vehicle v : list) {
            System.out.println("Vehicle: " + v.vehicleId + " | Mileage: " + v.mileage);
        }
    }
}
