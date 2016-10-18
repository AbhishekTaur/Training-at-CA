package servlets2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
/**
 * Servlet implementation class EmpDataServlet
 */
public class EmpDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
	
	public void init(){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			ps = con.prepareStatement("select employee_id,first_name,salary from employees where department_id=?");
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException se){
			se.printStackTrace();
		}
	}
		
	
	public void service(ServletRequest req,ServletResponse res) throws IOException{
		try{
		
		String deptIdStr = req.getParameter("deptid");
		int deptId = Integer.parseInt(deptIdStr);
		ps.setInt(1, deptId);
		
		ResultSet rs = ps.executeQuery();
		
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");
		pw.println("<table>");
		while(rs.next()){
			int eid = rs.getInt(1);
			int sal = rs.getInt(3);
			String n = rs.getString(2);
			pw.println("<tr>");
			pw.println("<td>"+ eid +"</td>");
			pw.println("<td>"+ n +"</td>");
			pw.println("<td>"+ sal +"</td>");
			pw.println("</tr>");
		}
		
						
		pw.println("</table>");
		pw.println("<form action='Index.html'>");
		pw.println("<input type='submit' value='Go back'>");
		pw.println("</form>");
		pw.println("</body></html>");
						
		pw.close(); 
		
		}
		
		catch(SQLException ex){
			ex.printStackTrace();
		}
		
	}
	public void destroy(){
		try{
			con.close();
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
	}
}
