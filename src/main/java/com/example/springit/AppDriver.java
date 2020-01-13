package com.example.springit;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

import com.example.springit.config.SpringitProperties;

/*
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan - Searches within this package for the classes this application needs
 */
@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class AppDriver {
	
	private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);
	
	@Autowired
	private SpringitProperties springitProperties;
	
	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(AppDriver.class, args);
		
		System.out.println("Welome to Springit");
	}
	
	@Bean 
	@Profile("dev")
	CommandLineRunner runner() {
		return args -> {
			System.out.println("Printing all bean names in the application context.");
			System.out.println("---------------------------------------------");
			String[] beans = applicationContext.getBeanDefinitionNames();
			Arrays.sort(beans);
			log.error("CommandLineRunner.run()");
			
		};
	}
}
