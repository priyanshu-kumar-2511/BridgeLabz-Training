package gamerzone;

/*8. GamerZone – High Score Ranking System (Quick Sort)
Story: A global multiplayer game needs to rank thousands of players in real-time based on their
scores after every match. The list is dynamic, large, and often unsorted. Quick Sort is used to
reorder players quickly for leaderboards.
Concepts Involved:
● Quick Sort
● Sorting dynamic, large datasets
● Performance-driven solution*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===== Welcome To Game Zone =====");
		
		System.out.print("Enter number of players: ");
		int numberOfPlayer = sc.nextInt();
		sc.nextLine();
		
		List<Player> players = new ArrayList<>(); 
		
		for(int i=1; i<= numberOfPlayer; i++) {
			System.out.println("\nPlayer " + i);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Score: ");
			int score = sc.nextInt();
			sc.nextLine();
			
			players.add(new Player(name, score));
		}
		
		QuickSort.quickSort(players, 0, players.size()-1);
		System.out.println("\nGamerZone Leaderboard: ");
		int rank = 1;
		for(Player p : players) {
			System.out.println(rank++ +" -> "+ p.name+" - "+p.score);
		}
	}
}
