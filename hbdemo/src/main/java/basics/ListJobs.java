package basics;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ListJobs {

	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure(); // load hibernate.cfg.xml

		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		// HQL 
		List<Job> jobs = s.createQuery("from Job", Job.class).list();
		 
		for (Job j : jobs) {
			System.out.printf("%-10s  %-20s %7d\n", j.getId(), j.getTitle(), j.getMinsal());
		}
		
		s.close();
		sf.close();
	}
}
