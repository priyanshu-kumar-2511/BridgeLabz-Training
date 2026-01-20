package smartlibrary;

/*2. SmartLibrary – Auto-Sort Borrowed Books (Insertion Sort)
Story: A digital kiosk in a library maintains a list of books a user has borrowed. Every time a
new book is issued, the system adds it to the user's list while keeping it alphabetically sorted
by title. Since insertions are done one at a time, and the list is usually already sorted, Insertion
Sort is the perfect fit.

Concepts Involved:
● Insertion Sort
● Dynamic list insertion
● Nearly sorted data*/

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BorrowedBookList list = new BorrowedBookList();
		
		while(true) {
			System.out.println("====== SmartLibrary Kiosk ======");
			System.out.println("1. Borrow Book");
			System.out.println("2. View Borrowed Books");
			System.out.println("3. Exit");
			System.out.print("Choose: ");
			
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1: 
				System.out.print("Enter book title: ");
				String title = sc.nextLine();
				list.borrowBook(title);
				break;
				
			case 2:
				list.displayBooks();
				break;
				
			case 3:
				System.out.println("Thank you for using SmartLibrary");
				return;
				
			default:
				System.out.println("Invalid Choice");
			}    
		}
	}
}
