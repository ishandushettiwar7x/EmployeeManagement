package io.sevenx.employeemanagement.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import io.sevenx.employeemanagement.data.Employee;

public class DatabaseManager {
	public static final String username = "root";
	public static final String password = "";
	public static final String url = "jdbc:mysql://127.0.0.1:3306/?user=root";

	public static void putInDatabase(List<Employee> employeeList) {
		// TODO Auto-generated method stub
		try {
			Connection con  = DriverManager.getConnection(
					url, username, password);
			Statement statement = con.createStatement();
			for (Employee emp: employeeList) {
				statement.execute("INSERT INTO `employees`.`employee` (`employeeId`, `firstName`, `lastName`, `email`, `baseSalary`) VALUES ('" + 
			emp.getEmployeeId() + "', '"+emp.getFirstName() + "', '" + emp.getLastName() + "', '"+emp.getEmail() +
			"', '" + emp.getBaseSalary() + "');");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	public static List<Employee> getFromDatabase() throws SQLException{
		Connection con  = DriverManager.getConnection(
				url, username, password);
		Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery("SELECT * FROM employees.employee;");
		List<Employee> employee = new ArrayList<>();
		
		while(rs.next()) {
			Employee e = new Employee();
			e.setEmployeeId(rs.getInt(1));
			e.setFirstName(rs.getString(2));
			e.setLastName(rs.getString(3));
			e.setEmail(rs.getString(4));
			e.setBaseSalary(rs.getInt(5));
			
			employee.add(e);
		}
		return employee;
	}

}
