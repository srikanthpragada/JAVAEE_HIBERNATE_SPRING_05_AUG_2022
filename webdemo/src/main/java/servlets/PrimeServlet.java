package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PrimeServlet() {
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 doGet(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		int num = Integer.parseInt(request.getParameter("num"));

		boolean prime = true;
		String result;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime)
			result = num + " is a Prime Number";
		else
			result = num + " is a not Prime Number";

		PrintWriter pw = response.getWriter();
		pw.println("<h1>" + result + "</h1>");
	}

}
