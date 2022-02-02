package io.sevenx.employeemanagement;

import io.sevenx.employeemanagement.data.*;
public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer dev = new Developer();
		dev.setFirstName("Ishan");
		dev.setLastName("Dushettiwar");
		dev.setBaseSalary(200000);
		dev.setBonus(50000);
		System.out.println("Developer of the month is "+dev.getFirstName()+" "+dev.getLastName());
		System.out.println("His salary with bonus  is "+dev.getSalary());
		

	}

}
