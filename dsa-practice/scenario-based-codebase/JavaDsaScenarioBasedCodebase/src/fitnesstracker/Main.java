package fitnesstracker;

/*5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Leaderboard board = new Leaderboard();
		
		while(true) {
			System.out.println("====== Fitness Tracker ======");
			System.out.println("1. Add or Update the Steps");
			System.out.println("2. View Leaderboard");
			System.out.println("3. Exit");
			System.out.print("Choose: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			
			case 1:
				System.out.print("User Name: ");
				String name = sc.nextLine();

				System.out.print("Steps count of today: ");
				int steps = sc.nextInt();
				
				board.addOrUpdate(name, steps);
				break;
				
			case 2:
				board.displayLeaderboard();
				break;
				
			case 3:
				System.out.println("Thank you using Fitness Tracker");
				return;
				
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}
