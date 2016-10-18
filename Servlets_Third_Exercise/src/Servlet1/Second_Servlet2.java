package Servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second_Servlet2
 */
public class Second_Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void service(ServletRequest req, ServletResponse res) throws IOException{
        
        
        ServletContext sc = getServletContext();
        Employee e1 = (Employee)sc.getAttribute("emp");
        PrintWriter pw1 = res.getWriter();
        
        if(e1 == null){
                        pw1.println("<html><body>");
                        pw1.println("Employee not found");
                        pw1.println("</body></html>");
                        
        }
        else
        {
                        pw1.println("<html><body>");
                        pw1.println("<table>");
                        pw1.println("<th>First Name</th>");
                        pw1.println("<th>Last Name</th>");
                        pw1.println("<th>Salary</th>");
                        pw1.println("<tr>");
                        pw1.println("<td>"+ e1.getFirst_name()+"</td>");
                        pw1.println("<td>"+ e1.getLast_name() +"</td>");
                        pw1.println("<td>"+ e1.getSalary() +"</td>");
                        pw1.println("</tr>");
                        pw1.println("</table>");
                        pw1.println("</body></html>");
        }
	}
}
