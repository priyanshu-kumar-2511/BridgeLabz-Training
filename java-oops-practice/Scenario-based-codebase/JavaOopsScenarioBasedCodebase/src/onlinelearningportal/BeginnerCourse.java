package onlinelearningportal;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor i) {
        super(title, i);
    }

    @Override
    public String generateCertificate(Student s) {
        if (s.getCompletedModules() < totalModules)
            return "Not eligible for certificate";

        return "BEGINNER CERTIFICATE\nStudent: " + s.name +
               "\nCourse: " + title +
               "\nInstructor: " + instructor.name;
    }
}
