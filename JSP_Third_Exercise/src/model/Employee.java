package model;

public class Employee {
	String firstName;
	String lastName;
	int salary;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Employee() {
		firstName = "Abhishek";
		lastName = "Taur";
		salary = 800000;
	}
	

}

