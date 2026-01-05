package com.sorting.countingsort.studentages;

public class CountingSortAges {

    public void sortAges(int[] ages) {

        int minAge = 10;
        int maxAge = 18;

        int range = maxAge - minAge + 1;

        // Step 1: Count array
        int[] count = new int[range];

        // Store frequency of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Step 2: Cumulative frequency
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        // Step 3: Output array
        int[] output = new int[ages.length];

        // Place elements in correct position (stable sort)
        for (int i = ages.length - 1; i >= 0; i--) {
            int age = ages[i];
            int pos = count[age - minAge] - 1;
            output[pos] = age;
            count[age - minAge]--;
        }

        // Copy back to original array
        for (int i = 0; i < ages.length; i++) {
            ages[i] = output[i];
        }
    }
}
