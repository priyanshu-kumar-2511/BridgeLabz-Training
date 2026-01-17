package com.generics.smartwarehouse;

/*1. Smart Warehouse Management System
Concepts: Generic Classes, Bounded Type Parameters, Wildcards
Problem Statement:
You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries, and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
Hints:
Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
Implement a generic class Storage<T extends WarehouseItem> to store items safely.
Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        Storage<Groceries> groceriesStorage = new Storage<>();
        Storage<Furniture> furnitureStorage = new Storage<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Smart Warehouse System =====");
            System.out.println("1. Add Electronics");
            System.out.println("2. Add Groceries");
            System.out.println("3. Add Furniture");
            System.out.println("4. View Electronics");
            System.out.println("5. View Groceries");
            System.out.println("6. View Furniture");
            System.out.println("7. Exit");
            System.out.print("Choose: ");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Item name: ");
                    electronicsStorage.addItem(
                        new Electronics(sc.nextLine(), askQty(sc))
                    );
                    break;

                case 2:
                    System.out.print("Item name: ");
                    groceriesStorage.addItem(
                        new Groceries(sc.nextLine(), askQty(sc))
                    );
                    break;

                case 3:
                    System.out.print("Item name: ");
                    furnitureStorage.addItem(
                        new Furniture(sc.nextLine(), askQty(sc))
                    );
                    break;

                case 4:
                    WarehouseUtil.displayAll(electronicsStorage.getItems());
                    break;

                case 5:
                    WarehouseUtil.displayAll(groceriesStorage.getItems());
                    break;

                case 6:
                    WarehouseUtil.displayAll(furnitureStorage.getItems());
                    break;

                case 7:
                    System.out.println("Warehouse system closed");
                    return;
            }
        }
    }

    private static int askQty(Scanner sc) {
        System.out.print("Quantity: ");
        return sc.nextInt();
    }
}
