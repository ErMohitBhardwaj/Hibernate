package Com.BikkadIT.Application;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BikkadIT.model.Student;
import Com.BikkadIT.model.Course;

public class ManyToManyMapping {

	public static void main(String[] args) {
		
		Course cu=new Course();
		cu.setCouseId(1);
		cu.setCourseName("java");

		Course cu1=new Course();
		cu1.setCouseId(2);
		cu1.setCourseName("C++");

		Course cu2=new Course();
		cu2.setCouseId(3);
		cu2.setCourseName("Python");

		Course cu3=new Course();
		cu3.setCouseId(4);
		cu3.setCourseName("Testing");

		
		List<Course> l=new ArrayList<Course>();
		l.add(cu);
		l.add(cu1);
		l.add(cu2);
		
		List<Student> l1=new ArrayList<Student>();
	
		
		
		
		Student s=new Student();
		s.setStudentId(1);
		s.setName("Mohit");
		s.setCourse(l);
		
		
		
		
		
		Student s1=new Student();
		s1.setStudentId(2);
		s1.setName("Mahesh");
		s1.setCourse(l);

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(s);
		session.save(cu);
		session.save(cu1);
		session.save(cu2);
		session.save(cu3);
		session.save(s1);
		
		
		transaction.commit();
		session.close();
		
		
	}

}