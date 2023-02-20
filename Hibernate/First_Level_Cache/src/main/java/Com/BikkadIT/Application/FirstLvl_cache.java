package Com.BikkadIT.Application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import Com.BikkadIT.model.Student;

public class FirstLvl_cache {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		Student student = session.get(Student.class, 1);
		System.out.println(student);
		
		
		//Checking is session contains that object.
		System.out.println("Session contains this object in cache : "+session.contains(student));

		
		
		//recalling same object
		//this time object fetched from cache which is holded by session.
		Student student1 = session.get(Student.class, 1);
		System.out.println(student1);

		session.close();

		
		//checking is session contains that object after closing session. it gives error session is closed.
		//System.out.println("Session contains this object in cache : "+session.contains(student));
		
	}

}
