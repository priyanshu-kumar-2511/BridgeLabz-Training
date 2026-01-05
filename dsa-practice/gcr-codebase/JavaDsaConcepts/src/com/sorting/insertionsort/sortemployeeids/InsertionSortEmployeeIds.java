package com.sorting.insertionsort.sortemployeeids;

public class InsertionSortEmployeeIds {

    public void insertionSort(int[] employeeIDs) {

        for (int i = 1; i < employeeIDs.length; i++) {
            int key = employeeIDs[i];      // element to be inserted
            int j = i - 1;

            // shift larger elements to the right
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--;
            }

            // insert at correct position
            employeeIDs[j + 1] = key;
        }
    }
}
