package org.rai.interviewApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2ManyDAO {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		Car c1=new Car();
		c1.setCarName("Rapid");
		c1.setCarModel("Skoda");
		c1.setCarColor("Mate Black");
		
		Car c2=new Car();
		c2.setCarName("Q7");
		c2.setCarModel("Audi");
		c2.setCarColor("White");
		
		Car c3=new Car();
		c3.setCarName("city");
		c3.setCarModel("Honda");
		c3.setCarColor("Black");
		
		Car c4=new Car();
		c4.setCarName("Chevrolet");
		c4.setCarModel("Cruze");
		c4.setCarColor("Mate Black");
		
		List <Car> carlist=new ArrayList<Car>();
		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		carlist.add(c4);
		
		Person p=new Person();
		p.setPesonName("Rahul kumar");
		p.setAddress("Bihar");
		p.setPersonMob(8269825987L);
		p.setCars(carlist);
		
		ses.save(p);
		tran.commit();
		ses.close();
	}
}
