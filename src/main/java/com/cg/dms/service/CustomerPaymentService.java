package com.cg.dms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dms.repository.ICustomerPaymentRepository;

@Service
public class CustomerPaymentService implements ICustomerPaymentService {
	
	@Autowired
	private ICustomerPaymentRepository icustomerpaymentrepository;

}
