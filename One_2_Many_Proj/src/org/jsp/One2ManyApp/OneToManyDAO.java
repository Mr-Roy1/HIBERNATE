package org.jsp.One2ManyApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDAO {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		
		Car c1=new Car();
		c1.setCarName("Rapid");
		c1.setCarModel("Skoda");
		
		Car c2=new Car();
		c2.setCarName("Q7");
		c2.setCarModel("Audi");
		
		Car c3=new Car();
		c3.setCarName("city");
		c3.setCarModel("Honda");
		
		List<Car> carlist =new ArrayList<Car>();
		carlist.add(c1);
		carlist.add(c2);
		carlist.add(c3);
		Person person=new Person();
		person.setPersonName("Pappu Rai");
		person.setCars(carlist);
		ses.save(person);
		tran.commit();
		ses.close();
		
	}
}
