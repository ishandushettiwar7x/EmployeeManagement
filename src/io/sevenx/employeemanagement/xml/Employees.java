package io.sevenx.employeemanagement.xml;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import io.sevenx.employeemanagement.data.Employee;
@XmlRootElement
public class Employees {
	private List<Employee> employees;

	public List<Employee> getEmployee() {
		return employees;
	}

	public void setEmployee(List<Employee> employees) {
		this.employees = employees;
	}
	

}
