package jdbc1;

import java.sql.*;


public class JDBCTestThree {
	public static void main(String []aths){
		
		int empid = Integer.parseInt(aths[0]);
		int marks = Integer.parseInt(aths[2]);
		String name = aths[1];
		String address = aths[3];
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "hr", "hr");
			System.out.println("Connection 2 is created\n");
			PreparedStatement p1 = conn2.prepareStatement("INSERT into STUDENT VALUES(?,?,?,?)"); 
			p1.setInt(1,empid);
			p1.setString(2,name);
			p1.setString(4, address);
			p1.setInt(3,marks);
			p1.executeUpdate();
//			Statement stmt2 = conn2.createStatement();
			
//			int b = stmt2.executeUpdate("INSERT INTO STUDENT VALUES("+empid+",'"+name+"',"+marks+",'"+address+"')");
//			System.out.println("Number of rows updated is " +b);
			
		} 
		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
