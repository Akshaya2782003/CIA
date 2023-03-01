package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AddressModel 
{
	@Id
	private String employeeName;
    private String address;
    private int pincode;
	public AddressModel() {
		super();
	}
	public AddressModel(String employeeName, String address, int pincode) {
		super();
		this.employeeName = employeeName;
		this.address = address;
		this.pincode = pincode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
    
}
