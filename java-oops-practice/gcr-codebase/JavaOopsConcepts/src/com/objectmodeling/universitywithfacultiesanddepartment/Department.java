package com.objectmodeling.universitywithfacultiesanddepartment;

public class Department {
	 String departmentName;

	 Department(String departmentName) {   // not public
	    this.departmentName = departmentName;
	 }

	 void showDepartment() {
	     System.out.println(" Department: " + departmentName);
	 }
}
