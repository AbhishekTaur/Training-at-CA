
package data;

public class Solution {
	public static void main(String[] args) {
		DataProvider data = DataProvider.getProvider();
		Employee e = data.getEmployee(103);
		System.out.println(e.getFirst_name()+" "+e.getLast_name()+" salary is "+e.getSalary());
	}

}
