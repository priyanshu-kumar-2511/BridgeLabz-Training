package medwarehouse;

import java.util.*;

public class MergeSort {
	public static List<Medicine> sort(List<Medicine> medicines){
		if (medicines.size() <= 1) {
            return medicines;
        }

        int mid = medicines.size() / 2;

        List<Medicine> left = sort(medicines.subList(0, mid));
        List<Medicine> right = sort(medicines.subList(mid, medicines.size()));

        return merge(left, right);
    }

    private static List<Medicine> merge(List<Medicine> left, List<Medicine> right) {

        List<Medicine> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {

            if (left.get(i).getExpiryDate().compareTo(right.get(j).getExpiryDate()) <= 0) {

                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i++));
        }

        while (j < right.size()) {
            result.add(right.get(j++));
        }

        return result;
	}
}
