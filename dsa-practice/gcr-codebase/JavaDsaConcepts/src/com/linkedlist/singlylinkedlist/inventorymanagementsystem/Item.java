package com.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class Item {
    String name;
    int id;
    int qty;
    double price;

    Item next;

    Item(String name, int id, int qty, double price) {
        this.name = name;
        this.id = id;
        this.qty = qty;
        this.price = price;
        this.next = null;
    }
}
