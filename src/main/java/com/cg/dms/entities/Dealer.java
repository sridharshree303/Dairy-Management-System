package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//class is an entity
@Entity
public class Dealer extends AbstractUser {
	@Id // primarykey
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dealerId;

	// getters and setters
	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}
}





///  farmer -->   company  --> dealer  --> customer