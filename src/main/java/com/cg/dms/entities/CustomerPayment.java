package com.cg.dms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class CustomerPayment extends Payment{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7267766373145125579L;
	@ManyToOne
	@JoinColumn(name="dealerId")
	private Dealer dealer;

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	
	
}
