package org.rai.interviewApp;
// Used to delete the data from the Database  //

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Chhotu kumar");
		s.setAddress("Bihar");
		s.setRollno(112);
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		Student st=(Student)ses.get(Student.class, 2);
		
		ses.delete(st);
		tran.commit();
		ses.close();
		
	}

}
