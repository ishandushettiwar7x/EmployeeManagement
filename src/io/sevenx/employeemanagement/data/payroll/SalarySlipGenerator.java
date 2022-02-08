package io.sevenx.employeemanagement.data.payroll;

import io.sevenx.employeemanagement.data.*;
public class SalarySlipGenerator {
	public static void printSalary(Employee employee) {
		System.out.println("Name "+employee.getFirstName()+" "+employee.getLastName());
		System.out.println("Salary "+employee.getSalary());
		
	}

}
