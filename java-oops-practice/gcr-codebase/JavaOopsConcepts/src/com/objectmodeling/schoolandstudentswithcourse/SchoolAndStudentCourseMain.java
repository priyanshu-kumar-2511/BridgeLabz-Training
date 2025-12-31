package com.objectmodeling.schoolandstudentswithcourse;

public class SchoolAndStudentCourseMain {
	public static void main(String[] args) {

        // Create school
        School tit = new School("Technocrats Institute of Technology");

        // Create students (independent objects)
        Student rahul = new Student("Rahul");
        Student priyanshu = new Student("Priyanshu");

        // School aggregates students
        tit.addStudent(rahul);
        tit.addStudent(priyanshu);

        // Create courses (independent)
        Course java = new Course("Java");
        Course python = new Course("Python");

        // Students enroll in courses (Association)
        rahul.enroll(java);
        rahul.enroll(python);
        priyanshu.enroll(java);

        // Views
        tit.showStudents();
        rahul.showCourses();
        priyanshu.showCourses();
        java.showStudents();
        python.showStudents();
    }
}
