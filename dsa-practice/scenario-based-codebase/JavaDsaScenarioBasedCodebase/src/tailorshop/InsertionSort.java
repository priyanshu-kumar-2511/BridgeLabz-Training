package tailorshop;

import java.util.*;

public class InsertionSort {
	static void sort(List<Shop>list) {
		int numberOfOrder = list.size();
		
		for(int i=1; i<numberOfOrder; i++) {
			Shop currentOrder = list.get(i);
			
			int j = i-1;
			
			while(j>=0 && list.get(j).getDeliveryDate().isAfter(currentOrder.getDeliveryDate())) {
				list.set(j+1,  list.get(j));
				j--;
			}
			j++;
			list.set(j, currentOrder);
		}
		System.out.println("\nList Sorted Successfully...\n");
	}
	
	void displayMovieList(ArrayList<Shop>list) {
		if(list.isEmpty()) {
			System.out.println("List is Empty");
			return;
		}
		
		for(Shop m : list) {
			System.out.println(m);
		}
	}
}
