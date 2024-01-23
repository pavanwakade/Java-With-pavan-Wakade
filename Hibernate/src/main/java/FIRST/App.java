package FIRST;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args)
	
	{
      
		 Configuration config = new Configuration();
	        config.configure();

	        // local SessionFactory bean created
	        SessionFactory sessionFactory = config.buildSessionFactory();

	        Session session = sessionFactory.openSession();
	        Transaction tx = session.beginTransaction();

	        Student s2 = new Student();
	        s2.setRollno(5);
	        s2.setName("shubham");
	        s2.setAddress("wai");

	        // session.save(s1);
	        session.persist(s2);

//	        session.getTransaction().commit();
	        tx.commit();
	        session.close();

		
	}

}
