package com.cg.dms.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotNull;

///mapped superclasshas no separate table 
//applied to the entities that extends [inheritance]
@MappedSuperclass
public class Payment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8033530529788101286L;

	// Id as primarykey
	@Id
	private int paymentId;

	// now() date and time
	private LocalDateTime dateTime;
	
	@NotNull(message = "Bill number shouble be manadatory*")
	private float bill;
	
	@NotNull
	private int milkUnits;
	
	private double unitPrice;

	//getters and setters
	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public int getMilkUnits() {
		return milkUnits;
	}

	public void setMilkUnits(int milkUnits) {
		this.milkUnits = milkUnits;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
