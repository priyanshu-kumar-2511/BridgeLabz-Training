package com.generics.smartwarehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String name, int quantity) {
        super(name, quantity);
    }

    public String getCategory() {
        return "Groceries";
    }
}
