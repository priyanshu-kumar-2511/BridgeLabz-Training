package hospitalpatientmanagementsystem;

public abstract class Patient {

    private String patientId;
    private String name;
    private int age;
    private String medicalHistory;   // sensitive

    protected Doctor doctor;

    // Normal admission
    public Patient(String id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = "Not Provided";
    }

    // Emergency admission
    public Patient(String id, String name, int age, String emergencyDetails) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = emergencyDetails;
    }

    public void assignDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getSummary() {
        return patientId + " | " + name + " | Age: " + age;
    }

    public abstract String displayInfo();
}

