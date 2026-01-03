package universitycourseenrollmentsystem;

import java.util.*;

public abstract class Student {
    private String id;
    private String name;
    private double gpa;   // private → protected from tampering

    protected List<Enrollment> enrollments = new ArrayList<>();

    // Normal constructor
    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overloaded constructor (elective preference)
    public Student(String id, String name, String elective) {
        this.id = id;
        this.name = name;
    }

    public void enroll(Course c) {
        enrollments.add(new Enrollment(this, c));
    }

    public void updateGPA() {
        double total = 0;
        int count = 0;

        for (Enrollment e : enrollments) {
            if (e.getNumericGrade() > 0) {
                total += e.getNumericGrade();
                count++;
            }
        }
        if (count > 0)
            gpa = total / count;
    }

    public String getTranscript() {
        String data = id + " | " + name + "\n";
        for (Enrollment e : enrollments) {
            data += e.getCourse().getDetails() + " : " + e.getGrade() + "\n";
        }
        data += "GPA: " + gpa;
        return data;
    }
}
