package optionalclass.studentmanagement;

import java.util.*;

public class StudentService {

    private List<Student> students = new ArrayList<>();

    public StudentService() {
        students.add(new Student(1, "Sakshi", "sakshi@gmail.com", null, "Bhagalpur", "Billi"));
        students.add(new Student(2, "Priyanshu", "kumarpriyanshu77828@gmail.com", "6207394439", null, null));
    }

    /* 1. Safe Email Fetch */
    public String getEmail(Student student) {
        return student.getEmail().orElse("Email not available");
    }

    /* 2. Default Phone */
    public String getPhone(Student student) {
        return student.getPhone().orElse("0000000000");
    }

    /* 3. Find Student by ID */
    public String findStudentById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().map(Student::getName).orElse("Student not available");
    }

    /* 4. Safe Address Fetch */
    public String getAddress(Student student) {
        return student.getAddress().orElse("Address not provided");
    }

    /* 5. Nickname or Real Name */
    public String getDisplayName(Student student) {
        return student.getNickname().orElse(student.getName());
    }

    public List<Student> getAllStudents() {
        return students;
    }
}
