package com.sorting.selectionsort.sortexamscores;

public class SelectionSortExamScores {
	public void selectionSort(int marks[]) {
		int size = marks.length;
		
		for(int i=0;i<size-1;i++) {
			int min_index = i;
			for(int j=i+1;j<size;j++) {
				if(marks[j]<marks[min_index]) {
					min_index = j;
				}
			}
			int tempt = marks[i];
			marks[i] = marks[min_index];
			marks[min_index] = tempt;
		}
	}
}
