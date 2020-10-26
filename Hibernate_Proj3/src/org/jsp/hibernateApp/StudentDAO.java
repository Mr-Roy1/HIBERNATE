package org.jsp.hibernateApp;
//To delete the data from the database server.

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
		
		Student std=(Student)ses.get(Student.class,3);
		ses.delete(std);
		
		tran.commit();
		ses.close();
	}
}
