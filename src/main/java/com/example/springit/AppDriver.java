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
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.example.springit.config.SpringitProperties;
import com.example.springit.domain.Comment;
import com.example.springit.domain.Link;
import com.example.springit.repository.CommentRepository;
import com.example.springit.repository.LinkRepository;

/*
 * @SpringBootConfiguration
 * @EnableAutoConfiguration
 * @ComponentScan - Searches within this package for the classes this application needs
 */
@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
@EnableJpaAuditing 
public class AppDriver {
	
	private static final Logger log = LoggerFactory.getLogger(SpringApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AppDriver.class, args);
		
		System.out.println("Welome to Springit");
	}
	
	@Bean 
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting Started with Spring 2", "https://therealdanvega.com/spring-boot-2");
			linkRepository.save(link);
			
			Comment comment = new Comment("This Spring Boot 2 link is awesome", link);
			commentRepository.save(comment);
			link.addComment(comment);
			
		};
	}
}
