package org.jsp.One2ManyApp;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="Person_Details")
public class Person {           // CHILD CLASS //
	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	@OneToMany(cascade = CascadeType.ALL)    // Third Table will be Generated by Merging Parent Table And Child Table//
	private List<Car> cars;
	
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	
	

}