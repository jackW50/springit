package com.example.springit.model;

public class Link {

	private Long id;
	private String title;
	private String url;
	
	public Link() {
		super();
		
	}

	public Link(Long id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
