package com.sorting.bubblesort.sortstudentmarks;

import java.util.*;

/*1. Bubble Sort - Sort Student Marks
Problem Statement:
A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
*/

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of students : ");
		int numberOfStudents = sc.nextInt();
		
		int marks[] = new int[numberOfStudents];
		
		System.out.println("Enter the marks : ");
		for(int i=0;i<numberOfStudents;i++) {
			marks[i] = sc.nextInt();
		}
		
		// calling bubble sort method
		BubbleSortStudentMarks sorter = new BubbleSortStudentMarks();
		sorter.bubbleSort(marks);
		
		System.out.println("After applying Bubble Sort : ");
		for(int m : marks) {
			System.out.println(m);
		}
		
	}
}
