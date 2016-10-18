<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Information</title>
</head>
<body>
<%@ page import="java.util.*" %>
<%@ page import="java.io.IOException" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="javax.servlet.ServletConfig" %>
<%@ page import="javax.servlet.ServletContext" %>
<%@ page import="javax.servlet.ServletContext" %>
<%@ page import="javax.servlet.ServletException" %>
<%@ page import="javax.servlet.ServletRequest" %>
<%@ page import="javax.servlet.ServletResponse" %>
<%@ page import="javax.servlet.http.HttpServlet" %>
<%@ page import="javax.servlet.http.HttpServletRequest" %>
<%@ page import="javax.servlet.http.HttpServletResponse" %>
<%@ page import="java.sql.*" %>
<%! Connection con;  %>
<%! PreparedStatement ps;  %>
<% 	Class.forName("oracle.jdbc.driver.OracleDriver"); 
 	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr"); 
 	ps = con.prepareStatement("select employee_id,first_name,salary from employees where department_id=?"); 
 	String deptIdStr = request.getParameter("deptid"); 
 	int deptId = Integer.parseInt(deptIdStr); 
 	ps.setInt(1, deptId); 
	ResultSet rs = ps.executeQuery(); 
%>
<table>
<% while(rs.next()){ %>
<% int eid = rs.getInt(1); %>
<% int sal = rs.getInt(3); %>
<% String n = rs.getString(2); %>
<tr>
	<td><%=eid%></td>
	<td><%=n %></td>
	<td><%=sal %></td>
</tr>
<% } %>
</table>
</body>
</html>