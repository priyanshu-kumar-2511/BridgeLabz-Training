package com.sorting.bubblesort.sortstudentmarks;

import java.util.*;

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
