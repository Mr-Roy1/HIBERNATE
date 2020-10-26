package org.rai.interviewApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class BoyDAO {

	public static void main(String[] args) {
		Boy b=new Boy();
		b.setName("Chhotu Kumar");
		b.setAge(15);
		b.setMobNo(5316459621L);
		b.setAddress("Bihar");
		b.setQualification("10th");
		
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
