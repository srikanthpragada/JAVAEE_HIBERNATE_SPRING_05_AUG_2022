package filters;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebFilter("*")
public class AuthFilter extends HttpFilter implements Filter {
     
    public AuthFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	 
	public void destroy() {
		 
	}
	 
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		 
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String url = req.getRequestURI();
		System.out.println(url);
		if(url.endsWith("login.jsp"))
		   chain.doFilter(request, response);
		else
		{
			 // check whether user is authenticated 
			HttpSession session = req.getSession();
			if (session == null || session.getAttribute("uname") == null) // Authentication is not done
				res.sendRedirect("/webdemo/jsps/login.jsp");
			else
				chain.doFilter(request, response);  // invoke the endpoint 
			
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
