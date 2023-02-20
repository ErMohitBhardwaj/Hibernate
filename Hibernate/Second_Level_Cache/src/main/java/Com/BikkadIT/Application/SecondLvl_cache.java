package Com.BikkadIT.Application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import Com.BikkadIT.model.Student;

public class SecondLvl_cache {

	public static void main(String[] args) {

		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		

		Session session = factory.openSession();
		
		//first
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		
		session.close();
		
		
		
		Session session1=factory.openSession();
		
		//2nd
		Student student1 = session1.get(Student.class, 1);
		System.out.println(student1);
		
		session1.close();

		
		
		
	}

}
