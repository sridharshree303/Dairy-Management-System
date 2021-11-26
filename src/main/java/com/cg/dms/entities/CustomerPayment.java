package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
// class is an entity
@Entity
public class CustomerPayment extends Payment{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7267766373145125579L;
	// mapping
	//joined column with primarykey
	@ManyToOne                    
	@JoinColumn(name="dealerId")   
	private Dealer dealer;
	
	//mapping 
	//joins with Customer table 
	@ManyToOne
	@JoinColumn(name="customerId")  
	private Customer customer;

	
	//getters and setters
	public Dealer getDealer() {
		return dealer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	
}
