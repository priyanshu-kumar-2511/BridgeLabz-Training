package com.collections.queueinterface.implementastackusingqueue;

/*4. Implement a Stack Using Queues
Implement a stack data structure using two queues and support push, pop, and top operations.
Example:
Push 1, 2, 3 → Pop → Output: 3.
*/

import java.util.*;

public class StackUsingQueues {
	private Queue<Integer> q1 = new LinkedList<>();
	private Queue<Integer> q2 = new LinkedList<>();
	
	public void push(int x) {
		q2.add(x);
		
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		
		Queue<Integer> temp = q1;
		q1 = q2;
		q2 = temp;
	}
	
	public int pop() {
		if(q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.remove();
	}
	
	public int top() {
		if(q1.isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return q1.peek();
	}
	
	public boolean isEmpty() {
		return q1.isEmpty();
	}
	
	// main method
	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();
		
		stack.push(12);
		stack.push(16);
		stack.push(20);
		
		System.out.println("Pop: "+ stack.pop());
		System.out.println("Top: "+ stack.top());
	}
}
