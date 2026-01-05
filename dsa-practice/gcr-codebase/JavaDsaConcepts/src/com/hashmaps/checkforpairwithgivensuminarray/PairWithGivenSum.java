package com.hashmaps.checkforpairwithgivensuminarray;

import java.util.*;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int need = target - num;

            if (seen.contains(need)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}

