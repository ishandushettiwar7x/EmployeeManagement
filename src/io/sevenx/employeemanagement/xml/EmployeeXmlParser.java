package io.sevenx.employeemanagement.xml;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import io.sevenx.employeemanagement.data.Employee;

public class EmployeeXmlParser {
	

	public static List<Employee> parser(String path) {
		// TODO Auto-generated method stub
		File file = new File(path); 

		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Employees.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			Employees employees = (Employees) jaxbUnmarshaller.unmarshal(file);
			List<Employee> employee = employees.getEmployee();

			return employee;
			
		} catch (JAXBException e) {
		e.printStackTrace();
		}
		return null;

	}

}
