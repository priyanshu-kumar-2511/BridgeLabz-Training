package com.hashmaps.implementcustomhashmap;

/*Implement a Custom Hash Map
Problem: Design and implement a basic hash map class with operations for insertion, deletion, and retrieval.
Hint: Use an array of linked lists to handle collisions using separate chaining.*/

public class Main {

    public static void main(String[] args) {

        HashMap map = new HashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(12, 1200);   // collision (12 % 10 == 2)

        System.out.println(map.get(1));   // 100
        System.out.println(map.get(2));   // 200
        System.out.println(map.get(12));  // 1200

        map.remove(2);

        System.out.println(map.get(2));   // null
    }
}
