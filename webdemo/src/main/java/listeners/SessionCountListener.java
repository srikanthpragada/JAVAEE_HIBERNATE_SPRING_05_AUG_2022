package listeners;


import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

// @WebListener
public class SessionCountListener implements ServletContextListener, HttpSessionListener {
	int count = 0 ;
    public void sessionCreated(HttpSessionEvent se)  {
    	count++;
    	se.getSession().getServletContext().setAttribute("sessioncount", count);
    	System.out.println("Session Created! Count " + count);
    }

    public void sessionDestroyed(HttpSessionEvent se)  {
    	count --;
    	se.getSession().getServletContext().setAttribute("sessioncount", count);
    	System.out.println("Session Destroyed! Count " + count);
    }
    public void contextDestroyed(ServletContextEvent sce)  {
    	 

    }
    public void contextInitialized(ServletContextEvent sce)  { 
    	count = 0;
    }
	
}
