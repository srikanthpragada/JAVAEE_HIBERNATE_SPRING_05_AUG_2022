package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/showtime")
public class ShowTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ShowTimeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
 
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		Date cd = new Date();
		PrintWriter pw = response.getWriter();
		pw.println("<h1 style='color:blue'>" + cd.toString() + "</h1>");
		
	}

}
