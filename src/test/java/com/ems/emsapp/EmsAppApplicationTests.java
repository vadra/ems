package com.ems.emsapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class EmsAppApplicationTests {
	
	Logger logger = LoggerFactory.getLogger(EmsAppApplicationTests.class);
	

	@Test
	void contextLoads() {
		logger.info("test case ececuted...");
		assertThat(true);
	}

}
