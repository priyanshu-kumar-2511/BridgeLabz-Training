package collegeinformationsystem;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students = new ArrayList<>();

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        students.remove(s);
    }

    public void printCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Faculty: " + faculty.name);
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(" - " + s.name);
        }
    }
}
