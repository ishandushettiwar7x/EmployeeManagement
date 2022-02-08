package io.sevenx.employeemanagement;

import java.sql.SQLException;
import java.util.List;

import io.sevenx.employeemanagement.data.*;
import io.sevenx.employeemanagement.db.DatabaseManager;
import io.sevenx.employeemanagement.ui.Display;
import io.sevenx.employeemanagement.xml.EmployeeXmlParser;
public class EmployeeManagement {

	public static void main(String[] args) throws SQLException {

		String path = "C:\\Users\\ishan\\eclipse-workspace\\EmployeeManagement\\src\\io\\sevenx\\employeemanagement\\xml\\employees.xml"; 

		List<Employee> employee = EmployeeXmlParser.parser(path);
		DatabaseManager.putInDatabase(employee);
		List<Employee> employeeList = DatabaseManager.getFromDatabase();
		
		Display.printEmployeeInfo(employeeList);
		

	}

}
