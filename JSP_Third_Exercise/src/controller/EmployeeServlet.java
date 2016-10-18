package controller;

import java.io.IOException;

import model.Processor;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		try{
			Processor p = new Processor();
			boolean b = p.process(request,response);
			RequestDispatcher rd;
			if(b){
				rd = request.getRequestDispatcher("Display.jsp");
				rd.forward(request, response);
			}
			else{
				rd = request.getRequestDispatcher("Error.jsp");
				rd.forward(request, response);
			}
		}
		catch(ServletException se){
			se.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
