package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
public class Company {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generation of integers
	private int id;

	private String companyName;

	// email annotation
	@Email  
	private String email;

	@NotBlank
	private String password;

	@Column(length = 10)
	private long mobileNumber;

	private String address;

	public Company() {
	}
	
	//constructor
	public Company(String companyName, String email, String password, long mobileNumber, String address) {
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}
	
	//constrctor
	public Company(int id, String companyName, String email, String password, long mobileNumber, String address) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
	}

	//getters and setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}