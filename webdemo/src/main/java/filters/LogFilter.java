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

@WebFilter("*.jsp")
public class LogFilter extends HttpFilter implements Filter {

	public LogFilter() {
		super();

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, 
			FilterChain chain)
			throws IOException, ServletException {
		// pre-process
		System.out.println(((HttpServletRequest) request).getRequestURI());
		// Call end-point 
		chain.doFilter(request, response);
		// post-process 
		System.out.println("Done!");
	}
	 
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
