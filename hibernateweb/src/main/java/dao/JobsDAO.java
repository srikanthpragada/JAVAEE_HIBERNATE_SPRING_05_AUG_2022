package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entities.Job;

public class JobsDAO {
	public static List<Job> getJobs() {
		SessionFactory sf = HibernateUtil.buildSessionFactory();
		Session s = sf.openSession();

		List<Job> jobs = s.createQuery("from Job", Job.class).list();
		s.close();
		return jobs;
	}

}
