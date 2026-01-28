package examresult;

public class StudentRecord {

    private String rollNo;
    private String name;
    private String subject;
    private int marks;

    public StudentRecord(String rollNo,
                         String name,
                         String subject,
                         int marks) {

        this.rollNo = rollNo;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + rollNo + ") - " + marks;
    }
}
