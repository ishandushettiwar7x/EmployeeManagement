package io.sevenx.employeemanagement.data;

public class Developer extends Employee {
	
	private int bonus;

	public Developer() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
		
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	public int getSalary() {
		return getBaseSalary() + this.bonus;
	}

}
