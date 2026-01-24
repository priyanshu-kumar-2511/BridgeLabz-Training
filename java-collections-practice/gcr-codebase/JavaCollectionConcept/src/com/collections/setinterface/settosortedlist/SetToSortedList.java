package com.collections.setinterface.settosortedlist;

/*4. Convert a Set to a Sorted List
Convert a HashSet of integers into a sorted list in ascending order.
Example:
Input: {5, 3, 9, 1} → Output: [1, 3, 5, 9].
*/
import java.util.*;

public class SetToSortedList {
	
	public static List<Integer> convertToSortedList(Set<Integer> set){
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(2);
		set.add(1);
		set.add(5);
		set.add(9);
		
		List<Integer> sortedList = convertToSortedList(set);
		System.out.println("Sorted List: "+ sortedList);
	}
}
