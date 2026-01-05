package collegeinformationsystem;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Course> courses = new ArrayList<>();

    // Private grades → encapsulation
    private double[] grades;

    public Student(int id, String name, String email, double[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    // GPA calculation using operators
    public double calculateGPA() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}