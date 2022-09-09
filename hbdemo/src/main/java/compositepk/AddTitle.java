package compositepk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddTitle {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("compositepk/hibernate.cfg.xml");  
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Title t = new Title();       
		t.setTitle("Hibernate Programmer");
		
		ChapterId cid = new ChapterId(1,1); // Primary key for chapter
		Chapter ch1 = new Chapter();
		ch1.setId(cid);
		ch1.setTitle("Introduction to ORM");
		
		Transaction trans = s.beginTransaction();
		s.save(t);
		s.save(ch1);
		trans.commit();
		s.close();                 
		sf.close();
	}
}
