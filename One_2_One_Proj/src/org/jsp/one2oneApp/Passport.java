package org.jsp.one2oneApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="passport_datails")
public class Passport {       // parent class //
	@Id
	@GeneratedValue
	private int passportId;
	private String passportName;
	
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public String getPassportName() {
		return passportName;
	}
	public void setPassportName(String passportName) {
		this.passportName = passportName;
	}
	
}
