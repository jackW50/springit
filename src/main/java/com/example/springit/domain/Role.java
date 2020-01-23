package com.example.springit.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter @Setter
@ToString
public class Role {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column
	@NonNull
	private String name;
	
	@ManyToMany( mappedBy = "roles")
	private Collection<User> users;

}
