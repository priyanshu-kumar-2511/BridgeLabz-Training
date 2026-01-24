package com.collections.setinterface.findsubsets;

/*5. Find Subsets
Check if one set is a subset of another.
Example:
Set1: {2, 3}, Set2: {1, 2, 3, 4} → Output: true.
*/

import java.util.*;

public class FindSubset {
	public static boolean subset(Set<Integer> set1, Set<Integer> set2){
		if(set2.containsAll(set1) || set1.containsAll(set2)) {
			return true;
		} 
		return false;
	}
	
	public static void main(String[] argts) {
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));
		
		boolean result = subset(set1 , set2);
		System.out.println("Is Set1 a subset of Set2 or Set2 a subset of set1? " + result);
	}
}
