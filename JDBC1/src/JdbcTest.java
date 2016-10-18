
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

public class JdbcTest {
	public static void main(String[] args){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			
			System.out.println("Connection created");
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeUpdate("insert into employees values (100,'Abhishek','Taur','ABHISHEK',9405109701,'04-JUL-2016','TAUAB01',800000,'KILL',124,50)");
			rset.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (SQLException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}