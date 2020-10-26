package org.rai.InterviewApp;
// Used to update data into Database //

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static void main(String[] args) {
//		Student s=new Student();     //This part is not required here because in this program we have update data into Database.
//		s.setName("Vicky Rai");
//		s.setAddress("Bihar");
//		s.setRollno(85);
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		
		Student st=(Student)ses.get(Student.class, 2);
		st.setName("Vicky Rai");
		st.setAddress("Delhi");
		st.setRollno(12);
		
		ses.update(st);
		tran.commit();
		ses.close();
	}

}
