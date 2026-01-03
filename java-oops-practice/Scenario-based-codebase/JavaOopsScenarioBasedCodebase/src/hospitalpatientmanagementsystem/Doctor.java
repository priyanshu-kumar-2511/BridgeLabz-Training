package hospitalpatientmanagementsystem;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public String displayInfo() {
        return "Doctor: " + name + " | " + specialization;
    }
}

