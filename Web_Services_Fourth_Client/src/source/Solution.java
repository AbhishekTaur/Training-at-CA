package source;

public class Solution {

	public static void main(String[] args) {
		StudentDataImplService n = new StudentDataImplService();
		StudentData d = n.getStudentDataImplPort();
		System.out.println(d.getStudent(1).getName());

	}

}
