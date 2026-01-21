package com.collections.listinterface.removeduplicateswhilepreservingorder;

/*4. Remove Duplicates While Preserving Order
Remove duplicate elements from a list while maintaining the original order of elements.
Example:
Input: [3, 1, 2, 2, 3, 4] → Output: [3, 1, 2, 4].
*/

import java.util.*;

public class RemoveDuplicatesPreserveOrder {

    public static List<Integer> removeDuplicates(List<Integer> list) {

        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer element : list) {
            if (seen.add(element)) {   
                result.add(element);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> output = removeDuplicates(input);

        System.out.println(output);
    }
}

