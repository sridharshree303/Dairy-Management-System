package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//class mentioned as entity
@Entity
@Table(name="delearpayment_table")
public class DealerPayment extends Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5903323702835773942L;
	
	//mapping many to one 
	//joins column with primarykey in Company
	@ManyToOne
	@JoinColumn(name = "id")
	private Company company;
	
	//mapping many to one 
	//joins column with primarykey in Dealer
	@ManyToOne
	@JoinColumn(name="dealerId")
	private Dealer dealer;

	//getters and setters
	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
		
	
}
