package com.sorting.quicksort.productprices;

public class QuickSortProducts {

    public void sortPrices(int[] prices, int low, int high) {
        if (low < high) {

            int pivotIndex = partition(prices, low, high);

            // Sort left of pivot
            sortPrices(prices, low, pivotIndex - 1);

            // Sort right of pivot
            sortPrices(prices, pivotIndex + 1, high);
        }
    }

    // Partition using LAST element as pivot
    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];  
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
