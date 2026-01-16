package robowarehouse;

import java.util.*;
public class RoboWarehouse {

    private List<Package> shelf = new ArrayList<>();

    // Robot adds package one by one
    public void addPackage(int weight) {
        shelf.add(new Package(weight));
        insertionSort();
        System.out.println("📦 Package loaded (weight: " + weight + ")");
    }

    // Insertion Sort (ascending by weight)
    private void insertionSort() {
        for (int i = 1; i < shelf.size(); i++) {
            Package key = shelf.get(i);
            int j = i - 1;

            while (j >= 0 && shelf.get(j).weight > key.weight) {
                shelf.set(j + 1, shelf.get(j));
                j--;
            }

            shelf.set(j + 1, key);
        }
    }

    public void showShelf() {
        if (shelf.isEmpty()) {
            System.out.println("Shelf is empty");
            return;
        }

        System.out.println("\nShelf Status (Light → Heavy):");
        for (Package p : shelf) {
            System.out.print(p.weight + "kg  ");
        }
        System.out.println();
    }
}
