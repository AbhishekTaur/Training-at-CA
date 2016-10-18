package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
public class First_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
	ServletContext context;
	
	public void init(ServletConfig config) throws ServletException {
		context = config.getServletContext();
		String driver = config.getInitParameter("driver");
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		
		try{
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,password);
			ps = con.prepareStatement("select first_name,last_name,salary from employees where employee_id=?");
		}
		catch(SQLException ex){
			ex.printStackTrace();
		}
		catch(ClassNotFoundException se){
			se.printStackTrace();
		}
	}
		
	
	public void service(ServletRequest req,ServletResponse res) throws IOException{
		String empIdStr = req.getParameter("empid");
		int empId = Integer.parseInt(empIdStr);
		
		try{
		
		ps.setInt(1, empId);
		
		ResultSet rs = ps.executeQuery();
		
		Employee emp = null;
		if(rs.next()){
			emp = new Employee();
			emp.setFirst_name(rs.getString(1));
			emp.setLast_name(rs.getString(2));
			emp.setSalary(rs.getInt(3));
		
			context.setAttribute("emp", emp);
		}
		PrintWriter pw = res.getWriter();
		
		pw.println("<html><body>");
		pw.println("<table>");
		pw.println("</table>");
		pw.println("<a href='Second_Servlet2'>Get Data here</a>");
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
