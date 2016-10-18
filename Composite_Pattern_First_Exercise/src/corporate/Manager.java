package corporate;

import java.util.ArrayList;

public class Manager implements Resource {

	private int employeeId;
	private String employeeName;
	private int salary;
	ArrayList<Resource> subordinates;
	
	public Manager(int employeeId, String employeeName, int salary,
			ArrayList<Resource> subordinates) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.subordinates = subordinates;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public ArrayList<Resource> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(ArrayList<Resource> subordinates) {
		this.subordinates = subordinates;
	}
	
	public void showDetails() {
		System.out.println("Name: "+this.employeeName+"\n"+"Employee_ID: "+this.employeeId+"\nSalary: "+this.salary);
		for(Resource e: subordinates){
			e.showDetails();
		}
	}

}
