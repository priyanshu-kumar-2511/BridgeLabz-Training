package com.functionalinterface.markerinterfaces.sensitivedatatagging;

public class ProductInfo {

    private String productName;

    public ProductInfo(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductInfo{productName='" + productName + "'}";
    }
}
