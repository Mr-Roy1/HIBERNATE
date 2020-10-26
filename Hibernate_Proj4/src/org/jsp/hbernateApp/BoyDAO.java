package org.jsp.hbernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BoyDAO {

	public static void main(String[] args) {
		Boy b=new Boy();
		
		b.setName("Deepak KUMAR");
		b.setRollNo(81);
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		
		ses.save(b);
		tran.commit();
		ses.close();

		
	}

}
