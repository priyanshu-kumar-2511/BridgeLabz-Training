package onlinelearningportal;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor i, int modules) {
        super(title, i, modules);
    }

    @Override
    public String generateCertificate(Student s) {
        if (s.getCompletedModules() < totalModules)
            return "Not eligible for certificate";

        return "ADVANCED PROFESSIONAL CERTIFICATE\n" +
               "Student: " + s.name +
               "\nCourse: " + title +
               "\nInstructor: " + instructor.name +
               "\nGrade: A+";
    }
}
