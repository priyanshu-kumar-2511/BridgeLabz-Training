package com.collections.queueinterface.hospitaltriagesystem;

/*3. Hospital Triage System
Simulate a hospital triage system using a PriorityQueue where patients with higher severity are treated first.
Example:
Patients: [("John", 3), ("Alice", 5), ("Bob", 2)] → Order: Alice, John, Bob.
*/

import java.util.*;

public class HospitalTriage {
	public static void main(String[] args) {
		
		PriorityQueue<Patient> queue = new PriorityQueue<>((p1, p2) -> Integer.compare(p2.getSeverity(), p1.getSeverity()));
		
		queue.add(new Patient("John", 3));
		queue.add(new Patient("Alice", 5));
		queue.add(new Patient("Bob", 2));
		
		System.out.println("Treatment Order: ");
		
		while(!queue.isEmpty()) {
			Patient next = queue.poll();
			System.out.println(next.getName());
		}
	}
}
