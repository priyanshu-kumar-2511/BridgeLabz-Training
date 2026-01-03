package hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

    public OutPatient(String id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String displayInfo() {
        return "OutPatient: " + getSummary();
    }
}
