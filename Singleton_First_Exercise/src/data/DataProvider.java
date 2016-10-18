package data;

import data.Employee;
import java.util.HashMap;

public class DataProvider {
	
	private HashMap<Integer,Employee> store;
	private static DataProvider instance = new DataProvider();
	
	public static DataProvider getProvider(){
		return instance;
	}
	
	public Employee getEmployee(int eid){
		return store.get(eid);
		
	}
	private DataProvider(){
		store = new HashMap<Integer,Employee>();
		store.put(100, new Employee("Abhishek","Taur",800000));
		store.put(101, new Employee("Sushant","Pasumarty",800000));
		store.put(102, new Employee("Naveen","Kurian",800000));
		store.put(103, new Employee("Amal","Sony",800000));
		store.put(104, new Employee("Yayi","Sri Harsha",800000));
	}
}
