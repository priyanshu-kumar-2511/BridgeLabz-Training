package fitnesstracker;

import java.util.*;

public class Leaderboard {
	
	private List<User> users = new ArrayList<>();
	
	public void addOrUpdate(String name, int steps) {
		for(User u : users) {
			if(u.getName().equalsIgnoreCase(name)) {
				u.setSteps(steps);
				bubbleSort();
				System.out.println("Steps updated");
				return;
			}
		}	
			
		users.add(new User(name, steps));
		bubbleSort();
		System.out.println("User added");
	}
	
	private void bubbleSort() {
		int size = users.size();
		
		for(int i=0; i<size-1; i++) {
			boolean swapped = false;
			
			for(int j=0; j<size-i-1;j++) {
				if(users.get(j).getSteps() < users.get(j+1).getSteps()) {
					User temp = users.get(j);
					users.set(j, users.get(j+1));
					users.set(j+1, temp);
				}
			}
			
			if(!swapped) {
				break;
			}
		}
	}
	
	public void displayLeaderboard() {
		if(users.isEmpty()) {
			System.out.println("No step data is available");
			return;
		}
		
		System.out.println("Daily Step Leaderboard: ");
		int rank = 1;
		for(User u : users) {
			System.out.println(rank++ +". "+ u.getName() +" -> " + u.getSteps() + " steps");
		}
	}
}
