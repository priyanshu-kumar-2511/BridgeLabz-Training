package optionalclass.employeesystem;

/*Scenario 2: 
1.Employee / Office System: An employee may or may not have a manager. Use Optional to fetch manager details.
2.Fetch employee bonus amount. If bonus is not defined, return 0.
3.Find employee by email ID. If not found, throw a custom exception using Optional.
4.Get employee insurance details safely using Optional.
5.Display employee middle name only if present.*/

public class Main {

    public static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        for (Employee emp : service.getAllEmployees()) {

            System.out.println("Employee: "+ emp.getFirstName() + " "+ emp.getLastName());
            System.out.println("Manager: "+ service.getManagerName(emp));
            System.out.println("Bonus: Rs" + service.getBonus(emp));
            System.out.println("Insurance: "+ service.getInsurance(emp));
            service.printMiddleName(emp);

            System.out.println("----------------------------");
        }

        /* Find by email */
        try {
            Employee found = service.findByEmail("sakshi@capgemini.in");
            System.out.println("Found: "+ found.getFirstName());
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }

        /* Not found case */
        try {
            service.findByEmail("modi@capgemini.in");
        } catch (EmployeeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
