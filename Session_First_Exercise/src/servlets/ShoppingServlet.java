package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.*;

/**imp
 * Servlet implementation class ShoppingServlet
 */
public class ShoppingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    HashMap<Integer,item> items;
    
    public void init(){
    	items=new HashMap<Integer,item>();
    	items.put(1, new item(1,"Item1",50));
    	items.put(2, new item(2,"Item2",50));
    	items.put(3, new item(3,"Item3",50));
    	items.put(4, new item(4,"Item4",50));
    	items.put(5, new item(5,"Item5",50));
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession();
		
		if(session.isNew()){
				sendPage(request,response,session);
				return;
		}
		
		String chk = request.getParameter("checkout");
		if(chk!=null){
			processCheckout(response,session);
			return;
		}
			
		processPurchase(request,response, session);
		
		
		
	}
	private void sendPage(HttpServletRequest req, HttpServletResponse res,HttpSession ses) throws IOException, ServletException{
		HashMap<Integer,Integer> cart = new HashMap<Integer,Integer>();
		ses.setAttribute("cart",cart);
		RequestDispatcher rd = req.getRequestDispatcher("shopping.html");
		rd.forward(req, res);
	}
	
	private void processPurchase(HttpServletRequest req, HttpServletResponse res,HttpSession ses) throws ServletException, IOException{
		String itemcodeStr = req.getParameter("itemCode");
		String qtyStr = req.getParameter("quantity");
		int itemCode = Integer.parseInt(itemcodeStr);
		int quantity = Integer.parseInt(qtyStr);
		
		HashMap<Integer,Integer> map = (HashMap<Integer,Integer>) ses.getAttribute("cart");
		
		Integer q = map.get(itemCode);
		if(q==null){
			map.put(itemCode, quantity);
		} else{
			map.put(itemCode, q + quantity);
		}
		RequestDispatcher rd = req.getRequestDispatcher("shopping.html");
		rd.forward(req, res);	
	}
	
	private void processCheckout(HttpServletResponse res,HttpSession ses) throws ServletException, IOException{
		HashMap<Integer,Integer> map = (HashMap<Integer,Integer>) ses.getAttribute("cart");
		PrintWriter pw = res.getWriter();
		pw.println("<html>");
		pw.println("<title>Bill</title>");
		pw.println("<body>");
		pw.println("<h1><center>Bill</center></h1>");
		pw.println("<table align='center' border='1'>");
		pw.println("<tr>");
		pw.println("<th>Item name</th>");
		pw.println("<th>Quantity</th>");
		pw.println("<th>Price</th>");
		pw.println("</tr>");
		int grand_total = 0;
		Set<Integer> keys = map.keySet();
		for(Integer i : keys){
			pw.println("<tr>");
			
			Integer qty = map.get(i);
			item itm = (item) items.get(i);
			String iname = itm.getItem_name();
			int price = itm.getPrice();
			int total_price = price * qty;
			grand_total += total_price;
			pw.println("<td>");
			pw.println(iname);
			pw.println("</td>");
			pw.println("<td>");
			pw.println(qty);
			pw.println("</td>");
			pw.println("<td>");
			pw.println(total_price);
			pw.println("</td>");
		}
		pw.println("<tr>");
		pw.println("<th>Grand total</th>");
		pw.println("<td></td>");
		pw.println("<td>"+grand_total+"</td>");
		pw.println("</tr>");
		pw.println("</table>");
		pw.println("</body></html>");
		ses.invalidate();
		pw.close();
	}

}
