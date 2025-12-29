/*
6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.
*/


import java.util.Scanner;

public class SmartParkingSystem {
    public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int capacityOfParking = 10;
		int occupied = 0;
		boolean exit = false;
		
		System.out.println("\nWelcome to the Smart Parking System");
		
		while(!exit) {
		
		    if(occupied == capacityOfParking) {
			    System.out.println("Parking is Full");
				break;
			}
  
            System.out.println("\n1. Park Car");
            System.out.println("2. Exit Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Close System");
            System.out.print("\nEnter your choice: ");  
			
		    int choice = sc.nextInt();

            System.out.println();
            switch (choice) {

                case 1:
                    if (occupied < capacityOfParking) {
                        occupied++;
                        System.out.println("Car parked successfully.");
                        System.out.println("Available Slots: " + (capacityOfParking - occupied));
                    } else {
                        System.out.println("Parking is full.");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited successfully.");
                        System.out.println("Available Slots: " + (capacityOfParking - occupied));
                    } 
                    break;

                case 3:
                    System.out.println("Total Slots    : " + capacityOfParking);
                    System.out.println("Occupied Slots : " + occupied);
                    System.out.println("Vaccant Slots     : " + (capacityOfParking - occupied));
                    break;

                case 4:
                    exit = true;
                    System.out.println("System closed.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
	
		
		