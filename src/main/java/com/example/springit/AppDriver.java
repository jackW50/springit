package com.example.springit;

import java.util.Arrays;

import org.ocpsoft.prettytime.PrettyTime;
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
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.springit.config.SpringitProperties;
import com.example.springit.domain.Comment;
import com.example.springit.domain.Link;
import com.example.springit.repository.CommentRepository;
import com.example.springit.repository.LinkRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/*
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan - Searches within this package for the classes this application needs
 */
@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
@EnableJpaAuditing 
@EnableSwagger2 
public class AppDriver {
	
	private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppDriver.class, args);
		
		System.out.println("Welome to Springit");
	}
	
	@Bean
	PrettyTime prettyTime() {
		return new PrettyTime();
	}
}
