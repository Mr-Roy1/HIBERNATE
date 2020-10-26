package org.rai.InterviewApp;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Person_Details_One_2_One")
public class Person {      //Child Class
	
	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private String personAddress;
	private long personMob;
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	
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
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public long getPersonMob() {
		return personMob;
	}
	public void setPersonMob(long personMob) {
		this.personMob = personMob;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	

}
