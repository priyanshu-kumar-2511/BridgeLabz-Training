package examcell;

import java.util.*;

public class ExamCell {

    private List<Student> students = new ArrayList<>();

    // Add student score (from any center)
    public void addStudent(String name, int score) {
        students.add(new Student(name, score));
        System.out.println("Student record added");
    }

    // Public method to generate rank list
    public void generateRankList() {
        if (students.size() <= 1) return;
        students = mergeSort(students);
        System.out.println("Rank list generated using Merge Sort");
    }

    // Merge Sort
    private List<Student> mergeSort(List<Student> list) {
        if (list.size() <= 1) return list;

        int mid = list.size() / 2;

        List<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        List<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    // Merge two sorted lists (descending score)
    private List<Student> merge(List<Student> left, List<Student> right) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).score >= right.get(j).score) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    public void showRankList() {
        if (students.isEmpty()) {
            System.out.println("No student data");
            return;
        }

        System.out.println("\nState-Level Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println(rank++ + ". " + s.name + " - " + s.score);
        }
    }
}
