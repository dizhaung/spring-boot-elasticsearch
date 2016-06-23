package com.sectong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author jiekechoo
 *
 */

@SpringBootApplication
public class BootElastic {

	private static final Logger logger = LoggerFactory.getLogger(BootElastic.class);

	public static final String INDEX_NAME = "4a25939d56384d92b07b551965b365d3-*";

	public static void main(String[] args) throws Exception {

		SpringApplication.run(BootElastic.class, args);
	}
}
