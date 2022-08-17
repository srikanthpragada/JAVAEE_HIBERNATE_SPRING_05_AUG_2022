package servlets;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
 

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LifeCycleServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	public void init(ServletConfig config) throws ServletException {
		 System.out.println("init()");
	}
 
	public void destroy() {
		 System.out.println("destroy()");
	}

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println(request.getClass());
		 System.out.println("doGet()");
	}

}
