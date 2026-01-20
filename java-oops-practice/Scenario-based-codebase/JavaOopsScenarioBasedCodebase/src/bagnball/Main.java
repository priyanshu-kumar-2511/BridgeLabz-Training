package bagnball;

/*2. Bag-n-Ball Organizer
OOP Concepts:
Classes, Objects, Inheritance (optional), Encapsulation, Method Design
Scenario:
You’re building a toy storage system for TinyTown Play School, which wants to keep track of
bags and the balls inside them.
Each Bag has:
● A unique ID, color, and capacity (number of balls it can hold)
Each Ball has:
● A unique ID, color, and size (small/medium/large)

Problem Statement:
Develop a Java system to:
● Add balls to a bag (up to capacity)
● Remove a ball from a bag
● Display all balls in a bag
● Display all bags and their ball count
● Prevent adding a ball if the bag is full

Encapsulate fields, use appropriate getters/setters, and model real-world object
relations through composition (i.e., Bag "has-a" list of Balls)
Bonus: Use an interface to define Storable behavior for both Bag and Ball.*/

import java.util.*;

public class Main {
	
	private static Bag findBag(List<Bag> bags, String id) {
	    for (Bag b : bags) {
	        if (b.getId().equals(id)) {
	        return b;
	        }
	    }
	    return null;
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Bag> bags = new ArrayList<>();

        while (true) {
            System.out.println("\n===== TinyTown Toy Storage =====");
            System.out.println("1. Create Bag");
            System.out.println("2. Add Ball to Bag");
            System.out.println("3. Remove Ball from Bag");
            System.out.println("4. View Balls in Bag");
            System.out.println("5. View All Bags");
            System.out.println("6. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: {
                    System.out.print("Bag ID: ");
                    String id = sc.nextLine();

                    System.out.print("Color: ");
                    String color = sc.nextLine();

                    System.out.print("Capacity: ");
                    int cap = sc.nextInt();
                    sc.nextLine();

                    bags.add(new Bag(id, color, cap));
                    System.out.println("Bag created");
                    break;
                }

                case 2: {
                    System.out.print("Bag ID: ");
                    String bagId = sc.nextLine();

                    Bag bag = findBag(bags, bagId);
                    if (bag == null) {
                        System.out.println("Bag not found");
                        break;
                    }

                    System.out.print("Ball ID: ");
                    String ballId = sc.nextLine();

                    System.out.print("Ball Color: ");
                    String color = sc.nextLine();

                    System.out.print("Ball Size: ");
                    String size = sc.nextLine();

                    if (!bag.addBall(new Ball(ballId, color, size))) {
                        System.out.println("Bag is full");
                    } else {
                        System.out.println("Ball added");
                    }
                    break;
                }

                case 3: {
                    System.out.print("Bag ID: ");
                    String bagId = sc.nextLine();

                    System.out.print("Ball ID: ");
                    String ballId = sc.nextLine();

                    Bag bag = findBag(bags, bagId);
                    if (bag != null && bag.removeBall(ballId)) {
                        System.out.println("Ball removed");
                    } else {
                        System.out.println("Ball or Bag not found");
                    }
                    break;
                }

                case 4: {
                    System.out.print("Bag ID: ");
                    String bagId = sc.nextLine();

                    Bag bag = findBag(bags, bagId);
                    if (bag != null) {
                        bag.showBalls();
                    } else {
                        System.out.println("Bag not found");
                    }
                    break;
                }

                case 5: {
                    if (bags.isEmpty()) {
                        System.out.println("No bags available");
                        break;
                    }

                    for (Bag b : bags) {
                        System.out.println("Bag " + b.getId() +" | Balls inside: " + b.getBallCount());
                    }
                    break;
                }

                case 6:
                    System.out.println("System closed");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
