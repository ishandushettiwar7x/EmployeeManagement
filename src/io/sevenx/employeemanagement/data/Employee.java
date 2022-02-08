package io.sevenx.employeemanagement.data;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Employee {
    private static int maxEmployeeId =0;
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private int baseSalary;

    public Employee(){
        setEmployeeId(++maxEmployeeId);
        setEmail(firstName+lastName+"@sevenx.io");
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static int getMaxEmployeeId() {
        return maxEmployeeId;
    }

    public static void setMaxEmployeeId(int maxEmployeeId) {
        Employee.maxEmployeeId = maxEmployeeId;
    }
    
    //public abstract int getSalary();
}
