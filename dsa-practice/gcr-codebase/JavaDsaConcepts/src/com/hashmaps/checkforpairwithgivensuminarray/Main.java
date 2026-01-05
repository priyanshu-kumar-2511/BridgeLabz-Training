package com.hashmaps.checkforpairwithgivensuminarray;

/*Check for a Pair with Given Sum in an Array
Problem: Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.
Hint: Store visited numbers in a hash map and check if target - current_number exists in the map.
*/

public class Main {
    public static void main(String[] args) {

        int[] arr = {8, 4, 1, 6, 2, 10};
        int target = 14;

        boolean result = PairWithGivenSum.hasPair(arr, target);

        System.out.println(result);
    }
}
