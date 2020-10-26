package org.rai.interviewApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Person_Details_Many_2_One")
public class Person {                             //parent class
	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private String personaddress;
	private long personMob;
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonaddress() {
		return personaddress;
	}
	public void setPersonaddress(String personaddress) {
		this.personaddress = personaddress;
	}
	public long getPersonMob() {
		return personMob;
	}
	public void setPersonMob(long personMob) {
		this.personMob = personMob;
	}
	
	
	
	

}
