package org.rai.interviewApp;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Many2ManyDAO {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		
		SessionFactory sef=conf.buildSessionFactory();
		
		Session ses=sef.openSession();
		
		Transaction tran=ses.beginTransaction();
		
		Course c1=new Course();
		c1.setCourseName("JAVA");
		
		Course c2=new Course();
		c2.setCourseName("ANGULAR");
		
		Course c3=new Course();
		c3.setCourseName("REACT");
		
		Course c4=new Course();
		c4.setCourseName("PYTHON");
		
		Student s1=new Student();
		s1.setStudentName("Rahul kumar");
		
		Student s2=new Student();
		s2.setStudentName("Deepak kumar");
		
		Student s3=new Student();
		s3.setStudentName("Anil Kumar Yadav");
		
		// ADD ALL THE COURSE OBJECTS INTO THE ARRAYLIST//
		List <Course> courselist=new ArrayList<Course>();
		courselist.add(c1);
		courselist.add(c2);
		courselist.add(c3);
		courselist.add(c4);
		
		// ADD ALL THE STUDENTS OBJECTS INTO ARRAYLIST //
		List <Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		// EACH STUDENT OBJECT CONTAINS A LIST OF COURSES //
		s1.setListofcourses(courselist);
		s2.setListofcourses(courselist);
		s3.setListofcourses(courselist);
		
		ses.save(s1);     //you should always use child class
		ses.save(s2);
		ses.save(s3);
		
		tran.commit();
		ses.close();
		
		
	}

}
