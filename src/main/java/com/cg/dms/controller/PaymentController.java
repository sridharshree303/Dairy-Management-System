package com.cg.dms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dms.entities.DealerPayment;
import com.cg.dms.entities.Payment;
import com.cg.dms.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentservice;

	private static final Logger LOG = LoggerFactory.getLogger(PaymentController.class);
	
	@PostMapping("/setdealertocmpy")
	public ResponseEntity<Payment> insertDealerToCompany(@RequestBody DealerPayment payment){
		LOG.info("insert Dealer to company");
		Payment pay = paymentservice.insertDealerToComapnyPayment(payment);
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "New dealer is added");
		ResponseEntity<Payment> response = new ResponseEntity<Payment>(pay,headers,HttpStatus.OK);
		return response;
	}


}
