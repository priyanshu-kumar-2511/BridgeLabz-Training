package com.generics.smartwarehouse;

import java.util.*;

public class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added: " + item.name);
    }

    public List<T> getItems() {
        return items;
    }
}
