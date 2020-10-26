package org.rai.InterviewApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneDAO {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		Passport p=new Passport();
		p.setPassportName("Rahul Rai");
		p.setIssueDate("12/09/2013");
		p.setExpiryDate("20/12/2025");
		
		Person person=new Person();
		person.setPersonName("Rahul kumar yadav");
		person.setPersonAddress("bihar");
		person.setPersonMob(8269825987L);
		
		person.setPassport(p);
		
		ses.save(person);
		tran.commit();
		ses.close();
		
		

	}

}
