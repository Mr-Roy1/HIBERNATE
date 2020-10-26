package org.rai.interviewApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Car_Details_one_2_many")
public class Car {   //Parent class
	@Id
	@GeneratedValue
	private int carId;
	private String carName;
	private String carModel;
	private String carColor;
	
	public int getCarNo() {
		return carId;
	}
	public void setCarNo(int carNo) {
		this.carId = carNo;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	
	

}
