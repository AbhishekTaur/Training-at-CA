package jdbc1;

import java.sql.*;

public class JDBCTestTwo {
	
	public static void main(String[] args){
		//int inp;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			System.out.println("Connection created");
			Statement stmt1 = conn1.createStatement();
			
			ResultSet rset1 = stmt1.executeQuery("select first_name ||  last_name, salary, department_id from EMPLOYEES where employee_id = 11121");
			
			if(rset1.next()){
				System.out.println(rset1.getString(1));
				System.out.println(rset1.getInt(2));
				System.out.println(rset1.getInt(3));	
			}
			
			else
				System.out.println("Employee doesnt exist");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		catch (SQLException e2){
			e2.printStackTrace();
			System.out.println("SQL Exception has arised because connectin aint created");
		}
		
		
		
	}
}
