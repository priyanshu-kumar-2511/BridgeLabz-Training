package com.sorting.insertionsort.sortemployeeids;

import java.util.*;

/*2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employee : ");
		int numberOfEmployee = sc.nextInt();
		
		System.out.println("Enter Employee IDs : ");
		int employeeID[] = new int[numberOfEmployee];
		
		for(int i=0;i<numberOfEmployee;i++) {
			employeeID[i] = sc.nextInt();
		}
		
		InsertionSortEmployeeIds sorter = new InsertionSortEmployeeIds();
        sorter.insertionSort(employeeID);

        System.out.println("After Insertion Sort:");
        for (int id : employeeID) {
            System.out.print(id + " ");
		}
			
		
	}
}
