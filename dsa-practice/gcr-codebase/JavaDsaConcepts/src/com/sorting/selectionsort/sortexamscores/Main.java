package com.sorting.selectionsort.sortexamscores;

import java.util.*;

/*5 Selection Sort - Sort Exam Scores
Problem Statement:
A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of students : ");
		int numberOfStudents = sc.nextInt();
		
		int marks[] = new int[numberOfStudents];
		System.out.println("Enter the marks of students : ");
		for(int i=0;i<marks.length; i++) {
			marks[i] = sc.nextInt();
		}
		
		SelectionSortExamScores sorter = new SelectionSortExamScores();
		sorter.selectionSort(marks);
		
		System.out.println("After Selection Sort : ");
		for(int m : marks) {
			System.out.println(m);
		}
	}
}
