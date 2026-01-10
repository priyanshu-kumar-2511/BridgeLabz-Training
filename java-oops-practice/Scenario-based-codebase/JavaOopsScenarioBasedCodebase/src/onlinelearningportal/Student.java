package onlinelearningportal;

public class Student extends User {
    private int completedModules;

    public Student(String name) {
        super(name);
        this.completedModules = 0;
    }

    public void completeModule() {
        completedModules++;
    }

    public int getCompletedModules() {
        return completedModules;
    }
}