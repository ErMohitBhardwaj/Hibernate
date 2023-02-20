package Com.BikkadIT.curdOperation;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Com.BikkadIT.curdOperation.model.Student;
import Com.BikkadIT.curdOperation.model.StudentAddress;

public class Create_Table_Update_Data {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = cfg.buildSessionFactory();

		Student st = new Student();
		st.setRollNo(1);
		st.setName("Mohit");
		st.setStream("Non-Medical");
		System.out.println(st);

		StudentAddress sa = new StudentAddress();
		sa.setCity("Badhra");
		sa.setState("Haryana");
		sa.setPinCode(127308);
		sa.setYouhere(true);
		sa.setAdmissionDate(new Date());

		Session currentSession = buildSessionFactory.openSession();

		Transaction tx = currentSession.beginTransaction();

		currentSession.save(st);
		currentSession.save(sa);
		tx.commit();
		currentSession.close();

		buildSessionFactory.close();
	}

}
