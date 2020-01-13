package com.example.springit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Link {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	
	private String url;
	
	public Link(Long id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}
	
	
}
