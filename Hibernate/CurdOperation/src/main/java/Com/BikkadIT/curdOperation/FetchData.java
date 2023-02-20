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
	
	//get or load method me arguments me 2 chij pass krni hain pahla Entity class name, Dusri Primary key 
	
	//fetch Data Using get() method if Record is not available return null.
	//get method ka use tb krte hn jb ye confirm na ho ki database me data hai.
	//get method firstly check cache if object not available in cache then get it from database.
	//it load data when it use only and the data not used somewhere like print.
	//agar data already exist hai(same query pahle chali hai) to wo dubara se query nhi chalaye or earlier object dega cache se
	
	//get()
	Student student = session.get(Student.class, 2);	
	System.out.println("Get method output : "+student);
	
	//Fetch Data Using load() method if Record not available it throws object not found exception.
	//load method ka use tb krenge jb confirm ho ki database me data hai.
	//load method give proxy object and only fatch data direct from database when its data use somewhere.
	
	//load() Lazy initialization, high performance because it not checks cache and provide a Proxy(Dummy) object
	Student load = session.load(Student.class, 1);
	System.out.println("load method output : "+load);
	
	
	session.close();
	factory.close();
	
}
}
