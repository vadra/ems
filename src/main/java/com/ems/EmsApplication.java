package com.ems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
//@EnableScheduling
public class EmsApplication {
	
	Logger logger = LoggerFactory.getLogger(EmsApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Initialised...");
	}

	public static void main(String[] args) {
		
		SpringApplication.run(EmsApplication.class, args);
	}

}
