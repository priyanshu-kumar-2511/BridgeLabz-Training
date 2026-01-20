package eduresults;

import java.util.*;

public class MergeSort {

    // 🔹 PUBLIC method to sort a single district (DESC by marks)
    public static List<Student> sortDistrict(List<Student> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;

        List<Student> left = sortDistrict(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = sortDistrict(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    // 🔹 Merge two sorted lists (DESC, STABLE)
    private static List<Student> merge(List<Student> a, List<Student> b) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < a.size() && j < b.size()) {
            if (a.get(i).getMarks() >= b.get(j).getMarks()) {
                result.add(a.get(i++)); // stable
            } else {
                result.add(b.get(j++));
            }
        }

        while (i < a.size()) result.add(a.get(i++));
        while (j < b.size()) result.add(b.get(j++));

        return result;
    }

    // 🔹 FINAL FIXED METHOD
    public static List<Student> generateRankList(List<List<Student>> districts) {

        // STEP 1: sort EACH district first
        List<List<Student>> sortedDistricts = new ArrayList<>();
        for (List<Student> d : districts) {
            sortedDistricts.add(sortDistrict(d));
        }

        // STEP 2: merge all sorted districts
        List<Student> result = sortedDistricts.get(0);
        for (int i = 1; i < sortedDistricts.size(); i++) {
            result = merge(result, sortedDistricts.get(i));
        }

        return result;
    }
}
