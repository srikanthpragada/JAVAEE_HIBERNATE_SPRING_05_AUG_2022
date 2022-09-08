package catalog;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddBook {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("catalog/hibernate.cfg.xml");  
		c.addAnnotatedClass(catalog.Book.class);
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Book b = new Book();
        b.setTitle("Java");
        b.setPrice(300);
        
		Transaction trans = s.beginTransaction();
		s.save(b);             
		trans.commit();
		s.close();                 
		sf.close();
	}
}
