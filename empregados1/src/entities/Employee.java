package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	//List<Employee> employee = new ArrayList<>();
	
	

	public Employee() {
	}

	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	/*public List<Employee> getEmployee() {
		return employee;
	}*/

	/*public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}*/
	
	public double payment() {
		return hours * valuePerHour;
	}
	
	
}
