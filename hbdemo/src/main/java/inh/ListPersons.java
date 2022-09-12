package inh;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ListPersons {

	public static void main(String[] args) throws Exception {
       
		Configuration c = new Configuration();
		c.configure("inh/hibernate.cfg.xml");
		
		SessionFactory sf = c.buildSessionFactory();
		Session s = sf.openSession();
		
		List<Person> persons = s.createQuery("from Person", Person.class).list();

		for (Person p : persons) {
			if (p instanceof Player)
			    System.out.println("Player  : " + p.getName());
			else
				System.out.println("Student : " + p.getName());
		}
		
		List<Player> players = s.createQuery("from Player", Player.class).list();
		for (Player p : players) {
  	       System.out.println(p.getName()   +":" + p.getGame());
		}

				
		s.close();
		sf.close();
	}
}
