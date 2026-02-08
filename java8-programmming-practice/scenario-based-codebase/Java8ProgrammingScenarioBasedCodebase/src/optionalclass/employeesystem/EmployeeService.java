package optionalclass.employeesystem;

import java.util.*;

public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {

        Employee manager = new Employee( 1, "Priyanshu", null, "Kumar","kumarpriyanshu@capgemini.in",5000.0,"Premium Insurance", null);
        Employee emp1 = new Employee( 2, "Ankesh", "Kumar", "Gupta", "ankesh@capgemini.in", null, null, manager );
        Employee emp2 = new Employee( 3, "Sakshi", null, "", "sakshi@capgemini.in", 3000.0, "Basic Insurance", null );

        employees.add(manager);
        employees.add(emp1);
        employees.add(emp2);
    }

    /* 1. Fetch Manager Details */
    public String getManagerName(Employee emp) {
        return emp.getManager().map(m -> m.getFirstName() + " " + m.getLastName()).orElse("No Manager Assigned");
    }

    /* 2. Fetch Bonus or return 0 */
    public double getBonus(Employee emp) {
        return emp.getBonus().orElse(0.0);
    }

    /* 3. Find Employee by Email */
    public Employee findByEmail(String email) {
        return employees.stream().filter(e -> e.getEmail().equals(email)).findFirst().orElseThrow(() ->new EmployeeNotFoundException("Employee not found with email: " + email));
    }

    /* 4. Get Insurance Safely */
    public String getInsurance(Employee emp) {
        return emp.getInsurance().orElse("No Insurance Details");
    }

    /* 5. Display Middle Name if Present */
    public void printMiddleName(Employee emp) {
        emp.getMiddleName().ifPresent(name -> System.out.println("Middle Name: " + name));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
