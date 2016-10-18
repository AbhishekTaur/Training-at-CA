<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display of Information</title>
</head>
<body>

<table align="center" border=1>
<tr>
	<th>First Name</th>
	<th>Last Name </th>
	<th>Salary </th>
</tr>
<c:forEach items="${empList}"  var="emp">
<tr><td>${emp.firstName}</td>
<td>${emp.lastName}</td>
<td>${emp.salary}</td>
</tr>
</c:forEach>
</table>
</body>
</html>