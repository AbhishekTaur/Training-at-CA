package jdbc1;

import java.sql.*;
import java.util.*;

public class JDBCTestSix {
	
	public static void main(String[] args){
		//int inp;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr" ,"hr");
			System.out.println("Connection created");
			CallableStatement cst = conn1.prepareCall("{call procedure_1(?,?,?) }");
			cst.setInt(1, 104);
			cst.registerOutParameter(2, Types.VARCHAR);
			cst.registerOutParameter(3, Types.INTEGER);
			cst.execute();
			
			int sal = cst.getInt(3);
			String name = cst.getString(2);
			
			System.out.println("name is "+name +" and salary is " +sal);
		
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
