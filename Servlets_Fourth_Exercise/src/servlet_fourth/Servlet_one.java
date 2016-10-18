package servlet_fourth;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet_fourth.Employee;

/**
 * Servlet implementation class Servlet_one
 */
public class Servlet_one extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	PreparedStatement ps;
	
	public void init(ServletConfig config) throws ServletException {
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
		
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException{
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
			
			req.setAttribute("empdata", emp);
			RequestDispatcher rd = req.getRequestDispatcher("/ServletSecond");
			rd.forward(req, res);	
		}
		
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
