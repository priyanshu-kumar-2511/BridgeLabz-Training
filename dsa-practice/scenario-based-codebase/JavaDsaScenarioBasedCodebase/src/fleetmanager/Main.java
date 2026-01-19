package fleetmanager;

/*10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: A fleet company schedules vehicle maintenance based on mileage. Each depot sends a
sorted list of vehicles. To create a master schedule, Merge Sort is used to combine these depot
lists efficiently.
Key Concepts:
● Sorted sublists from multiple sources
● Merge sort for final master list
● Efficient memory usage for large lists*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FleetManager manager = new FleetManager();
		
		List<Vehicle> depot1 = new ArrayList<>();
		List<Vehicle> depot2 = new ArrayList<>();
		
		System.out.println("Welcome to the Vehicle Maintenance Scheduler");
		
		System.out.print("Enter number of vehicles in Depot 1: ");
        int n1 = sc.nextInt();

        System.out.println("Enter vehicles for Depot 1 (sorted by mileage):");
        for (int i = 0; i < n1; i++) {
            System.out.print("Vehicle ID: ");
            String id = sc.next();
            System.out.print("Mileage: ");
            int m = sc.nextInt();
            depot1.add(new Vehicle(id, m));
            System.out.println();
        }

        System.out.print("\nEnter number of vehicles in Depot 2: ");
        int n2 = sc.nextInt();

        System.out.println("Enter vehicles for Depot 2 (sorted by mileage):");
        for (int i = 0; i < n2; i++) {
            System.out.print("Vehicle ID: ");
            String id = sc.next();
            System.out.print("Mileage: ");
            int m = sc.nextInt();
            depot2.add(new Vehicle(id, m));
            System.out.println();
        }

        List<Vehicle> master = manager.createMasterSchedule(depot1, depot2);
        manager.showSchedule(master);
	}
}
