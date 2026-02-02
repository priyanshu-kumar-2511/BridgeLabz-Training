package lambdaexpressions.officesystem;

public class Employee {
	private String name;
	private String department;
	private double salary;
	private int experience;
	
	public Employee(String name, String department, double salary, int experience) {
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.experience = experience;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public String toString() {
		return ("Name: "+ name+ " | Department: "+ department+ " | Salary: "+ salary+ " | Experience: "+ experience);
	}
}
