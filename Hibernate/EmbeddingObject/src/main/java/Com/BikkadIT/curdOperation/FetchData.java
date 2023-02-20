package Com.BikkadIT.curdOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Com.BikkadIT.curdOperation.model.Student;

public class FetchData {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure();
	SessionFactory factory = cfg.buildSessionFactory();
	
	Session session = factory.openSession();
	
	//fetch Data Using get() method if Record is not available return null.
	Student student = session.get(Student.class, 2);	
	System.out.println("Get method output : "+student);
	
	Student load = session.load(Student.class, 2);
	System.out.println("load method output : "+load);
	
	
	session.close();
	factory.close();
	
}
}
