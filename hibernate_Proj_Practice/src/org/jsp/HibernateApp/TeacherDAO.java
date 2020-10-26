
package org.jsp.HibernateApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TeacherDAO {

	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setName("Rahul");
		t.setSalary(50000);
		t.setAddress("Bihar");
		
		Configuration cnf=new Configuration();
		cnf.configure();
		
		SessionFactory sef=cnf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		ses.save(t);
		tran.commit();
		ses.close();
		
	}
}
