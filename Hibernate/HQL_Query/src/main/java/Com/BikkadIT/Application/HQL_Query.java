package Com.BikkadIT.Application;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BikkadIT.model.Course;
import Com.BikkadIT.model.Student;

public class HQL_Query {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		
		String query="from Student";
	
		Query q=session.createQuery(query);
		
		//Pegination -- It Use limit Query for MySql
		q.setFirstResult(0); // Index - which is the index to start data fetching.
		q.setMaxResults(5);	// How many result will be print on one page.
		
		List <Student> list=q.list();
		
		for(Student s:list) {
			
			System.out.println(s.getStudentId());
			
			System.out.println(s.getName());
		}
		
		
		
		
		session.close();
		
		
	}

}
