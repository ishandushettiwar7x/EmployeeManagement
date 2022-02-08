package io.sevenx.employeemanagement.ui;

import java.util.List;

import io.sevenx.employeemanagement.data.Employee;

public class Display {
	public static void printEmployeeInfo(List<Employee> employee) {
		for (Employee e: employee) {
	    	System.out.println("Name: " + e.getFirstName() + " " + e.getLastName() );
	    	System.out.println("Email: " + e.getEmail() );
	    	System.out.println("Salary: " + e.getBaseSalary());
	    	
	    	System.out.println("==========================");
	    	
	    	}
		 
	}

}
