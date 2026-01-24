package com.collections.queueinterface.circularbuffer;

public class CircularBuffer {
	private int[] buffer;
	private int capacity;
	private int front;
	private int rear;
	private int size;
	
	public CircularBuffer(int capacity) {
		this.capacity = capacity;
		buffer = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
	}
	
	public void insert(int value) {
		buffer[rear] = value;
		rear = (rear + 1) % capacity;
		
		if(size == capacity) {
			front = (front + 1) % capacity;
		} else {
			size++;
		}
	}
	
	public void display() {
		if(size == 0) {
			System.out.println("Buffer is Empty");
			return;
		} 
		
		System.out.println("Buffer: [");
		
		for(int i=0; i< size; i++) {
			int index = (front + 1) % capacity;
			System.out.print(buffer[index]);
			if(i != size -1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
