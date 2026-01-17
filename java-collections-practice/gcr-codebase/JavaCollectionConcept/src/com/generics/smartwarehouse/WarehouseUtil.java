package com.generics.smartwarehouse;

import java.util.List;

public class WarehouseUtil {

    // Can accept Storage<Electronics>, Storage<Groceries>, etc.
    public static void displayAll(List<? extends WarehouseItem> items) {
        System.out.println("\nWarehouse Inventory:");
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}
