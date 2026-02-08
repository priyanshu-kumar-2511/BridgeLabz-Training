package optionalclass.employeesystem;

import java.util.Optional;

public class Employee {

    private int id;
    private String firstName;
    private String middleName;  
    private String lastName;
    private String email;
    private Double bonus;       
    private String insurance;  
    private Employee manager;   

    public Employee(int id, String firstName, String middleName, String lastName, String email, Double bonus, String insurance, Employee manager) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.bonus = bonus;
        this.insurance = insurance;
        this.manager = manager;
    }

    public String getEmail() { return email; }

    public String getFirstName() { return firstName; }

    public Optional<String> getMiddleName() {
        return Optional.ofNullable(middleName);
    }

    public String getLastName() { return lastName; }

    public Optional<Double> getBonus() {
        return Optional.ofNullable(bonus);
    }

    public Optional<String> getInsurance() {
        return Optional.ofNullable(insurance);
    }

    public Optional<Employee> getManager() {
        return Optional.ofNullable(manager);
    }
}
