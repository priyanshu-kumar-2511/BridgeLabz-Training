package com.collections.queueinterface.circularbuffer;

/*5. Circular Buffer Simulation
Implement a circular buffer (fixed-size queue) using an array-based queue. When full, overwrite the oldest element.
Example:
Buffer size=3: Insert 1, 2, 3 → Insert 4 → Buffer: [2, 3, 4].
*/

public class Main {

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.display(); 

        cb.insert(4);
        cb.display();  

        cb.insert(5);
        cb.display();  
    }
}
