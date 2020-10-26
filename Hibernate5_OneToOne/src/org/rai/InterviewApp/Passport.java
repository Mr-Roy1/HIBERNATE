package org.rai.InterviewApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Passport_Details_One_2_One")
public class Passport {   //Parent Class
	@Id
	@GeneratedValue
	private int passportId;
	private String passportName;
	private String expiryDate;
	private String issueDate;
	
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
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	
	

}
