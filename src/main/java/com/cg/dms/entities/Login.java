package com.cg.dms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//class is an entity
//
@Entity
@Table(name="Login_table")
public class Login {

	//Id as primary
	//auto generated value
	@Id
	@Column(name="login_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String userPassword;

	
	//Constructor
	public Login() {
		super();
		
	}

	//Constructor
	public Login(int loginId, String userName, String userPassword) {
		super();
		this.loginId = loginId;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	//getters and setters
	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	//toString method
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "User [loginId=" + loginId + ", userName=" + userName + ", userPassword=" + userPassword + "]";
	}

}
