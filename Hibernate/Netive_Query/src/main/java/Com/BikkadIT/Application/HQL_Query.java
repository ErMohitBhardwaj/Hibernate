package Com.BikkadIT.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import Com.BikkadIT.model.Course;
import Com.BikkadIT.model.Student;

public class HQL_Query {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();

		// SQL Query
		String query = "Select * from Student_data";

		NativeQuery q = session.createSQLQuery(query);

		List<Object[]> list = q.list();

		for (Object[] s : list) {

			System.out.println(Arrays.deepToString(s));
			
			
			//used to fetch data from table by column index.
			//0 means 1st column 1 means 2nd column. we can do it in SQL query also.
			System.out.println(s[0]+" "+s[1]);

		}

		session.close();

	}

}
