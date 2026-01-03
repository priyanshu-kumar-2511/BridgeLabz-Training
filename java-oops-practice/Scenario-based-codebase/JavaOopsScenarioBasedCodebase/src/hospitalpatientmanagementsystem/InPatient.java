package hospitalpatientmanagementsystem;

public class InPatient extends Patient {

    private int daysAdmitted;

    public InPatient(String id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }

    @Override
    public String displayInfo() {
        return "InPatient: " + getSummary() + " | Days: " + daysAdmitted;
    }

    public int getDays() {
        return daysAdmitted;
    }
}
