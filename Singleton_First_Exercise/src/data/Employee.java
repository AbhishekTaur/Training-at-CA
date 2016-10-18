package data;

public class Employee {
	String first_name;
	String last_name;
	int salary;
	
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(String first_name, String last_name,
			int salary) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.salary = salary;
	}
}
