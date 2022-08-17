package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 
@WebServlet("/discount")
public class DiscountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DiscountServlet() {
        super();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int price = Integer.parseInt(request.getParameter("price"));
		int discount;
		
		if(price > 5000)
			discount = price * 20 / 100;
		else
			discount = price * 15 / 100;
		
		PrintWriter pw = response.getWriter(); 
		pw.println("<h2>Discount = " + discount + "</h2>");
	}
}
