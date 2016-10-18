package corporate;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Employee Abhishek = new Employee(100,"Abhishek Taur", 800000);
		Employee Sushant = new Employee(100,"Sushant Pasumarty", 800000);
		Employee Yayi = new Employee(100,"Yayi Sri Harsha", 800000);
		Employee Mohit = new Employee(100,"Mohit Grover", 800000);
		
		ArrayList<Resource> A = new ArrayList<Resource>();
		A.add(Abhishek);
		A.add(Sushant);
		A.add(Yayi);
		A.add(Mohit);
		Manager NoOne = new Manager(200, "No one", 0,A);
		ArrayList<Resource> B = new ArrayList<Resource>();
		B.add(NoOne);
		Manager Lord = new Manager(1000000, "Bhagvan", 100000000, B);
		Lord.showDetails();
	}

}
