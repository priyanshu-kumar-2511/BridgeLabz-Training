package com.collectors.studentresultgrouping;

/*1. Student Result Grouping
○ Scenario: Group students by grade level and collect names.
○ Task: Use Collectors.groupingBy().*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Ravi", "Grade 10"),
                new Student("Anita", "Grade 10"),
                new Student("Karan", "Grade 11"),
                new Student("Meera", "Grade 12"),
                new Student("Rahul", "Grade 11")
        );

        Map<String, List<String>> grouped = students.stream().collect(Collectors.groupingBy(
                        Student::getGradeLevel,Collectors.mapping(Student::getName,Collectors.toList())));

        grouped.forEach((grade, names) -> System.out.println(grade + " → " + names));
    }
}
