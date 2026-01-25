package com.collections.mapinterface.invertamap;

/*2. Invert a Map
Invert a Map<K, V> to produce a Map<V, K>. Handle duplicate values by storing them in a list.
Example:
Input: {A=1, B=2, C=1} → Output: {1=[A, C], 2=[B]}.
*/

import java.util.*;

public class InvertMap {
	public static <K, V> Map<V, List<K>> invertMap(Map<K, V> original){
		
		Map<V, List<K>> inverted = new HashMap<>();
		
		for(Map.Entry<K, V> entry : original.entrySet()){
			
			K key = entry.getKey();
            V value = entry.getValue();

            inverted.computeIfAbsent(value, v -> new ArrayList<>()).add(key);
		}
		return inverted;
	}
	
	public static void main(String[] args) {

        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);

        Map<Integer, List<String>> result = invertMap(input);

        System.out.println(result);
    }
}
