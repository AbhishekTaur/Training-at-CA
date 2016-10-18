package serverSide;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;

@WebService(endpointInterface = "serverSide.StudService")
public class StudentService {
	Connection con;
	PreparedStatement ps;
	Student Abhishek;
	public StudentService() throws ClassNotFoundException, SQLException {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			System.out.println();
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		catch(SQLException s){
			s.printStackTrace();
		}
		
	}
	public Student getStudent(int studentID) throws SQLException{
		Student Stud = null;
		try{
			ps = con.prepareStatement("select studentid,studentname,city from student where studentid=?");
			ps.setInt(1,studentID);
			ResultSet rs = ps.executeQuery();
			
			Stud = new Student();
			if(rs.next()){
				Stud.setStudentID(rs.getInt(1));
				Stud.setName(rs.getString(2));
				Stud.setCity(rs.getString(3));
			}
			System.out.println(Stud);
			return Stud;
			
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		return null;
	}
	public boolean setStudent(Student s) throws SQLException{
		try{
			ps = con.prepareStatement("INSERT INTO student(studentid,studentname,city)  VALUES (?,?,?)");
			ps.setInt(1, s.getStudentID());
			ps.setString(2, s.getName());
			ps.setString(3,s.getCity());
			ps.executeQuery();
			return true;
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return false;
		
	}
	
	
	

}
