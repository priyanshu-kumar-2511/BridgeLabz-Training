package com.generics.smartwarehouse;

public abstract class WarehouseItem {
    protected String name;
    protected int quantity;

    public WarehouseItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return name + " | Qty: " + quantity + " | Category: " + getCategory();
    }
}
