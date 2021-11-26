package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//mapped superclasshas no separate table 
//applied to the entities that extends [inheritance]
@MappedSuperclass
public abstract class AbstractUser {

	@NotNull
	private String userName;
	@NotNull
	private String firstName;
	@NotNull  //not allows null
	private String lastName;
	@NotNull
	@Size(min = 4, max = 10) // password should be between size 4 to 10 characters
	private String password;
	@Column(length = 10) // length should be max lenght 10 chars
	private long mobileNumber;
	@Email
	@NotBlank // Both NotNull and not allows whitespaces
	private String email;
	@NotNull
	private int milkunits;
	@NotEmpty
	private double unitprice;

	// getters and setters

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMilkunits() {
		return milkunits;
	}

	public void setMilkunits(int milkunits) {
		this.milkunits = milkunits;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}
}