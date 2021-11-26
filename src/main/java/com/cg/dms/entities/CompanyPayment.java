package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CompanyPayment extends Payment{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6450820627942528950L;
	
	//mapping
	//
	@ManyToOne
	@JoinColumn(name ="farmerId")
	private Farmer farmer;
	// mapping many to one
	@ManyToOne                  
	@JoinColumn(name="id")      
	private Company company;
	
	
	//getters and setters
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Farmer getFarmer() {
		return farmer;
	}

	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}

}
