package movietime;

/*6. MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering*/

import java.time.LocalTime;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		InsertionSort insertion = new InsertionSort();
		ArrayList<MovieShow> list = new ArrayList<>();
		System.out.println("===== Welcome To Movie Time Show =====\n");
		
		while(true) {
			System.out.println("Enter 1 to Display Movie List");
			System.out.println("Enter 2 to Add Movie in List");
			System.out.println("Enter 3 to Sort Movie");
			System.out.println("Enter 4 to Exit");
			System.out.print("Choose Your Option: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: 
				System.out.print("\n");
				insertion.displayMovieList(list);
				System.out.print("\n");
				break;
			
			case 2: 
				System.out.print("\nEnter movie name: ");
				String name = sc.nextLine();
				System.out.print("Enter movie time: ");
				LocalTime time = LocalTime.parse(sc.nextLine());
				list.add(new MovieShow(name, time));
				System.out.println("-> Show Added Successfully <- \n");
				break;
				
			case 3:
				System.out.print("\n");
				insertion.sorting(list);
				break;
				
			case 4:
				System.out.print("\n");
				System.out.println("-> System Closed <-");
				return;
				
			default:	
				System.out.print("\n");
				System.out.println("Invalid Option ");
			}
		}
	}
}
