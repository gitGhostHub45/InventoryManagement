package com.invenmang.inventorymanagement.entity;


import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document("employee")
public class Employee {
	@Id
	@GeneratedValue
	private String id;	
	private String  firstName;
	private String lastName;
	private String phone;
	private String  emailId;
	private String  address;
	private String  landmark;
	private String city;
	private String state;
	private String  country;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(String id, String firstName, String lastName, String phone, String emailId, String address,
			String landmark, String city, String state, String country) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.emailId = emailId;
		this.address = address;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	public String getId() {
		return id;
	}


	public String getFirstName() {
		return firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public String getPhone() {
		return phone;
	}



	public String getEmailId() {
		return emailId;
	}



	public String getAddress() {
		return address;
	}





	public String getLandmark() {
		return landmark;
	}





	public String getCity() {
		return city;
	}





	public String getState() {
		return state;
	}





	public String getCountry() {
		return country;
	}




	public void setId(String id) {
		this.id = id;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phone=" + phone
				+ ", emailId=" + emailId + ", address=" + address + ", landmark=" + landmark + ", city=" + city
				+ ", state=" + state + ", country=" + country + "]";
	}




	}
	
	 
	



	

	

	
	
	


