package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/StudentService")
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
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.TEXT_XML)
	public List<Student> getAll() throws SQLException{
		ps = con.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		
		ArrayList<Student> a = new ArrayList<Student>();
		while(rs.next()){
			Student stud = new Student();
			stud.setStudentID(rs.getInt(1));
			stud.setName(rs.getString(2));
			stud.setCity(rs.getString(3));
			a.add(stud);
		}
		
		return a;
		
	}
	
	@GET
	@Path("/get/{studentId}")
	@Produces(MediaType.TEXT_XML)
	public Student getStudent(@PathParam("studentId")int studentID) throws SQLException{
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
	
	
	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_XML)
	public String setStudent(Student s) {
		try{
			ps = con.prepareStatement("INSERT INTO student(studentid,studentname,city)  VALUES (?,?,?)");
			ps.setInt(1, s.getStudentID());
			ps.setString(2, s.getName());
			ps.setString(3,s.getCity());
			ps.executeUpdate();
			return "Succesful";
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return "Failure";
		
	}
}
