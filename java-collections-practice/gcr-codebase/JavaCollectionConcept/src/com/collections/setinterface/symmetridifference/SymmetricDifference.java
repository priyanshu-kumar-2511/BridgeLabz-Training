package com.collections.setinterface.symmetridifference;

/*3. Symmetric Difference
Find the symmetric difference (elements present in either set but not in both) of two sets.
Example:
Set1: {1, 2, 3}, Set2: {3, 4, 5} → Output: {1, 2, 4, 5}.
*/

import java.util.*;

public class SymmetricDifference {
	public static void main(String[] args) {
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));
		
		Set<Integer> diff1 = new HashSet<>(set1);
		diff1.removeAll(set2);
		
		Set<Integer> diff2 = new HashSet<>(set2);
		diff2.removeAll(set1);
		
		diff1.addAll(diff2);
		
		System.out.println("Symmetric Difference: " + diff1);
	}
}
