package org.rai.interviewApp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Students_Details_Many_2_Many")
public class Student {          //Child class
	@Id
	@GeneratedValue
	private int studentId;
	private String studentName;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Course> listofcourses;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getListofcourses() {
		return listofcourses;
	}
	public void setListofcourses(List<Course> listofcourses) {
		this.listofcourses = listofcourses;
	}
	

}
