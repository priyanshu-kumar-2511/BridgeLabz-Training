package flashdealz;

import java.util.*;

public class QuickSort {
	public static void quickSort(List<Product> list) {
		if(list == null || list.size() <= 1) {
			return;
		}
		quickSort(list, 0, list.size()-1);
	}
	
	private static void quickSort(List<Product> list, int low, int high) {
		if( low < high) {
			int p = partition(list, low, high);
			quickSort(list, low, p-1);
			quickSort(list, p+1, high);
		}
	}
	
	private static int partition(List<Product> list, int low, int high) {
		double pivot = list.get(high).getDiscount();
		int i= low-1;
		
		for(int j = low; j < high; j++) {
			if(list.get(j).getDiscount() >= pivot) {
				i++;
				swap(list, i, j);
			}
		}
		
		swap(list, i+1, high);
		return i+1;
	}
	
	private static void swap(List<Product> list, int i, int j) {
		Product temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j,  temp);
	}
}
