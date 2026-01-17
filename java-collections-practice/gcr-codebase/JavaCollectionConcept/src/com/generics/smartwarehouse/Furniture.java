package com.generics.smartwarehouse;

public class Furniture extends WarehouseItem {

    public Furniture(String name, int quantity) {
        super(name, quantity);
    }

    public String getCategory() {
        return "Furniture";
    }
}
