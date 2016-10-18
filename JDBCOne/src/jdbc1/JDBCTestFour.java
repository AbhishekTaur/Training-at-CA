package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class JDBCTestFour {
	
	public static void main(String[] args){
		
		StudentClass s1[] = {new StudentClass(1201,"Geralt",88,"Rivia"), new StudentClass(1202,"Yennefer",77,"Vengenberg"), new StudentClass(1203,"Triss MErigold",45,"Kovir"), new StudentClass(1204, "Vesemir",99,"Kaer Morhen")};  
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conn2 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe" , "hr", "hr");
			System.out.println("Connection 2 is created\n");
			PreparedStatement p1 = conn2.prepareStatement("INSERT into STUDENT VALUES(?,?,?,?)"); 
			
			int i=0;
			int empid = s1[i].getId();
			int marks = s1[i].getMarks();
			String name = s1[i].getName();
			String address = s1[i].getAddress();
			for(i=0;i<4;i++){
				
				p1.setInt(1, empid);
				p1.setString(2, name);
				p1.setInt(3,marks);
				p1.setString(4,address);
				p1.executeUpdate();
			}
			conn2.commit();
			
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
