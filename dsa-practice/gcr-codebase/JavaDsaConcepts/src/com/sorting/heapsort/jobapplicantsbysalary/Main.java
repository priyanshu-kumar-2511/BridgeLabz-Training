package com.sorting.heapsort.jobapplicantsbysalary;

import java.util.Scanner;
import java.util.Arrays;

/*6 Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
*/

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of job applicants: ");
        int n = sc.nextInt();

        int salaries[] = new int[n];

        System.out.println("Enter expected salaries:");
        for (int i = 0; i < n; i++) {
            salaries[i] = sc.nextInt();
        }

        HeapSortSalary sorter = new HeapSortSalary();
        sorter.heapSort(salaries);

        System.out.println("\nSorted Salary List (Ascending Order):");
        System.out.println(Arrays.toString(salaries));
    }
}
