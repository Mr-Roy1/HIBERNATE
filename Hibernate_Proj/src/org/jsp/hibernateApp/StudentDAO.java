package org.jsp.hibernateApp;
//TO insert the data into database server.

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.setName("pappu rai");
		s.setAddress("bihar");
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		
		ses.save(s);
		tran.commit();
		ses.close();
	}
}
