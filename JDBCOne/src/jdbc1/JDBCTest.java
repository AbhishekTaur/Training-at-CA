package jdbc1;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	
	public static void main(String[] args){
		
		try {
			int c;
			c = Integer.parseInt(args[0]);
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			System.out.println("Connection created");
			
			Statement stmt = conn.createStatement();
			
			ResultSet rset = stmt.executeQuery("select employee_id, FIRST_NAME, SALARY FROM EMPLOYEES WHERE DEPARTMENT_ID = "+ c);
			while(rset.next()){
				System.out.println(rset.getInt(1)+ "  " + rset.getString(2)+  "  " +rset.getInt(3));
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}





