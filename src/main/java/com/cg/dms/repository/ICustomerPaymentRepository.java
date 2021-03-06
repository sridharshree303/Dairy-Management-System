package com.cg.dms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.dms.entities.CustomerPayment;

//extends repository

@Repository
public interface ICustomerPaymentRepository extends JpaRepository<CustomerPayment, Integer> {

	
}