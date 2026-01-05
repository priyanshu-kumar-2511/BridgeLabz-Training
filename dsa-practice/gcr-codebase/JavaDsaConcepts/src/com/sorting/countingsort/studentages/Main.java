package com.sorting.countingsort.studentages;

import java.util.Scanner;
import java.util.Arrays;

/*7 Counting Sort - Sort Student Ages
Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = new int[n];

        System.out.println("Enter student ages (10 to 18 only):");
        for (int i = 0; i < n; i++) {
            ages[i] = sc.nextInt();
        }

        CountingSortAges sorter = new CountingSortAges();
        sorter.sortAges(ages);

        System.out.println("\nSorted Student Ages:");
        System.out.println(Arrays.toString(ages));
    }
}
