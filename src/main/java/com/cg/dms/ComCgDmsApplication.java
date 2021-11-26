package com.cg.dms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ComCgDmsApplication {
	
	// To generate messages in LOG format
	private static final Logger LOG = LoggerFactory.getLogger(ComCgDmsApplication.class);
	//main method
	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(ComCgDmsApplication.class, args);
		LOG.info("Welcome to project");
		LOG.info("Stop");
	}
}
