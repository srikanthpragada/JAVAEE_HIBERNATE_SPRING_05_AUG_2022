package basics;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddJob {
	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();  // load default config file - hibernate.cfg.xml
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Job job = new Job();       
		job.setId("HP");
		job.setTitle("Hibernate Programmer");
		job.setMinsal(500000);

		Transaction trans = s.beginTransaction();
		s.save(job);             
		trans.commit();
		s.close();                 
		sf.close();
	}
}
