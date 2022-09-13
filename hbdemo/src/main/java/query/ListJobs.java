package query;

import java.util.stream.Stream;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class ListJobs {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure("query/hibernate.cfg.xml");
		Session session = c.buildSessionFactory().openSession();
  		Stream<Job> jobs =  session.createQuery("from Job", Job.class).stream();
		jobs.forEach( j ->  
			System.out.printf("%-10s %-30s\n", j.getId(), j.getTitle())
		);
		session.close();
	}
}
