package manytomany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddEmployeesJobs {
	public static void main(String[] args) throws Exception {
		Configuration c = new Configuration();
		c.configure("manytomany/hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		Employee e = new Employee("Employee1");
		Job  j1 = new Job("Job1");
		Job  j2 = new Job("Job2");

		e.getJobs().add(j1);
		e.getJobs().add(j2);
		
		s.beginTransaction();
		s.save(e);
		s.save(j1);
		s.save(j2);
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
}
