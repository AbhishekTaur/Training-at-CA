package model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
import java.util.*;

public class Processor {
	public boolean process(HttpServletRequest req, HttpServletResponse res) throws ClassNotFoundException{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			PreparedStatement ps = con.prepareStatement("select first_name,last_name,salary from employees where department_id=?");
			String deptIdStr = req.getParameter("deptID");
			int deptId = Integer.parseInt(deptIdStr);
			ps.setInt(1, deptId);
			ResultSet rs = ps.executeQuery();
			Employee e= null;
			ArrayList<Employee> ar = new ArrayList<Employee>();
			while(rs.next()){
				e = new Employee();
				e.setFirstName(rs.getString(1));
				e.setLastName(rs.getString(2));
				e.setSalary(rs.getInt(3));
				ar.add(e);
			}
			req.setAttribute("empList", ar);
			return true;
		}
		catch(SQLException ex){
			req.setAttribute("message", "Couldn't Connect to SQL Database");
			return false;
		}
		catch(ClassNotFoundException se){
			req.setAttribute("message", "Class not Found");
			return false;
		}
	}
}
