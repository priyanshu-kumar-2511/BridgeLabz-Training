package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem {

    public Electronics(String name, int quantity) {
        super(name, quantity);
    }

    public String getCategory() {
        return "Electronics";
    }
}
