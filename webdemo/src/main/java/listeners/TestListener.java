package listeners;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class TestListener implements ServletContextListener, HttpSessionListener {

	public TestListener() {
		// TODO Auto-generated constructor stub
	}

	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("sessionCreated()");
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("sessionDestoryed()");
	}

	public void contextInitialized(ServletContextEvent sce)  { 
    	 ServletContext ctx = sce.getServletContext();
    	 String title = ctx.getInitParameter("title");
    	 ctx.setAttribute("title", title);
    	 
    	 System.out.println("contextInitialized()");
    }

	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestoryed()");
	}
}
