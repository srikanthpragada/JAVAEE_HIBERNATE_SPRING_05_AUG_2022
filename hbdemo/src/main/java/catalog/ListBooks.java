package catalog;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListBooks {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure("catalog/hibernate.cfg.xml");  
		c.addAnnotatedClass(catalog.Book.class);

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		// HQL 
		List<Book> books = s.createQuery("from Book", Book.class).list();
		 
		for (Book b : books) {
			System.out.printf("%-10s  %-20s %7d\n", b.getId(), b.getTitle(), b.getPrice());
		}
		
		s.close();
		sf.close();
	}
}
