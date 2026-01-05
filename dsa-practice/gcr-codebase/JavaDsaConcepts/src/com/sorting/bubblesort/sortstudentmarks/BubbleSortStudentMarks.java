package com.sorting.bubblesort.sortstudentmarks;

public class BubbleSortStudentMarks {
	public void bubbleSort(int marks[]) {
		int size = marks.length;
		
		for(int i=0;i<size-1;i++) {
			for(int j=0;j<size-i-1;j++) {
				if(marks[j] > marks[j+1]) {
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
	}
}
