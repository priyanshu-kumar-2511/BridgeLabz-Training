package smartlibrary;

import java.util.*;

public class BorrowedBookList {
	private List<Book> books = new ArrayList<>();
	
	public void borrowBook(String title) {
		books.add(new Book(title));
		insertionSort();
		System.out.println("Book issued successfully");
	}
	
	private void insertionSort() {
		for(int i=1;i<books.size(); i++) {
			Book key = books.get(i);
			int j = i-1;
			
			while(j>=0 && books.get(j).getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
				books.set(j+1,  books.get(j));
				j--;
			}
			
			books.set(j+1,  key);
		}
	}
	
	public void displayBooks() {
		if(books.isEmpty()) {
			System.out.println("No Books borrowed");
			return;
		}
		
		System.out.println("\nBorrowed Books: ");
		for(Book b : books) {
			System.out.println("- "+ b.getTitle());
		}
	}
}
