package com.example.springit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan - Searches within this package for the classes this application needs
 */
@SpringBootApplication
public class AppDriver {

	public static void main(String[] args) {
		SpringApplication.run(AppDriver.class, args);
	}
}
