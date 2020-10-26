package org.jsp.Many2OneApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2OneDAO {

	public static void main(String[] args) {
		
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		Person p=new Person();
		p.setPersonName("Deepak Rai");
		
		Car c1=new Car();
		c1.setCarName("Aventador");
		c1.setCarModel("Lamborghini");
		c1.setPerson(p);
		
		Car c2=new Car();
		c2.setCarName("520d");
		c2.setCarModel("BMW");
		c2.setPerson(p);
		
		Car c3=new Car();
		c3.setCarName("Phantom");
		c3.setCarModel("RollsRoyce");
		c3.setPerson(p);
		
		ses.save(c1);
		ses.save(c2);
		ses.save(c3);
		tran.commit();
		ses.close();
	}
}
