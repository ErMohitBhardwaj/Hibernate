package Com.BikkadIT.curdOperation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BikkadIT.curdOperation.model.Student;
import Com.BikkadIT.curdOperation.model.StudentAddress;

public class OneToOneMapping {

	public static void main(String[] args) {
		
		StudentAddress sa=new StudentAddress();
		sa.setAddressId(2);
		sa.setCity("Bhiwani");
		sa.setPinCode(127201);
		sa.setState("Haryana");
		
		Student s=new Student();
		s.setName("Mahesh");
		s.setRollNo(2);
		s.setStream("Medical");
		s.setStuadd(sa);
		
		
		StudentAddress sa1=new StudentAddress();
		sa1.setAddressId(1);
		sa1.setCity("Charkhi Dadri");
		sa1.setPinCode(127308);
		sa1.setState("Haryana");
		
		Student s1=new Student();
		s1.setName("Mohit");
		s1.setRollNo(1);
		s1.setStream("Non-Medical");
		s1.setStuadd(sa1);

		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(s);
		session.save(sa);
		session.save(s1);
		session.save(sa1);
		
		
		transaction.commit();
		session.close();
		
		
	}

}
