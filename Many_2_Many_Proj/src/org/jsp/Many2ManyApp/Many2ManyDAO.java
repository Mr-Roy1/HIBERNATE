package org.jsp.Many2ManyApp;

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
		c1.setCourseName("Java");
		
		Course c2=new Course();
		c2.setCourseName("J2EE");
		
		Course c3=new Course();
		c3.setCourseName("Framework");
		
		Student s1=new Student();
		s1.setStudentName("Ram");
		
		Student s2=new Student();
		s2.setStudentName("Ramesh");
		
		Student s3=new Student();
		s3.setStudentName("Suresh");
		
		// ADD ALL THE COURSE OBJECTS INTO THE ARRAYLIST//
		List<Course> courses=new ArrayList<Course>();
		courses.add(c1);
		courses.add(c2);
		courses.add(c3);
		
		// ADD ALL THE STUDENTS OBJECTS INTO ARRAYLIST //
		List<Student> students=new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		// EACH STUDENT OBJECT CONTAINS A LIST OF COURSES //
		s1.setListofcourses(courses);
		s2.setListofcourses(courses);
		s3.setListofcourses(courses);

		ses.save(s1);    //YOU SHOULD ALWAYS SAVE THE CHILD CLASS.
		ses.save(s2);
		ses.save(s3);
		
		tran.commit();
		ses.close();
	}
}
