package org.jsp.one2oneApp;

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
		p.setPassportName("Pappu Rai");
		
		Person person=new Person();
		person.setPersonName("PK Yadav");
		
		person.setPassport(p);
		ses.save(person);
		tran.commit();
		ses.close();
		
	}
}
