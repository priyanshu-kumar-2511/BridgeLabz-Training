package com.hashmaps.implementcustomhashmap;

public class HashMap {

    private final int CAPACITY = 10;
    private Entry[] table;

    public HashMap() {
        table = new Entry[CAPACITY];
    }

    private int hash(int key) {
        return key % CAPACITY;
    }

    // PUT
    public void put(int key, int value) {

        int index = hash(key);
        Entry head = table[index];

        // No collision
        if (head == null) {
            table[index] = new Entry(key, value);
            return;
        }

        // Traverse chain
        Entry current = head;
        while (true) {
            if (current.key == key) {
                current.value = value; // update
                return;
            }

            if (current.next == null)
                break;

            current = current.next;
        }

        // Insert at end
        current.next = new Entry(key, value);
    }

    // GET
    public Integer get(int key) {
        int index = hash(key);
        Entry current = table[index];

        while (current != null) {
            if (current.key == key)
                return current.value;
            current = current.next;
        }

        return null;
    }

    // REMOVE
    public void remove(int key) {
        int index = hash(key);
        Entry current = table[index];
        Entry prev = null;

        while (current != null) {

            if (current.key == key) {

                if (prev == null)
                    table[index] = current.next;
                else
                    prev.next = current.next;

                return;
            }

            prev = current;
            current = current.next;
        }
    }
}
