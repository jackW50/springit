package com.example.springit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springit.domain.Link;

public interface LinkRepository extends JpaRepository<Link, Long> {
	
	Link findByTitle(String title);
	
	List<Link> findAllByTitleLikeOrderByCreationDateDesc(String title);

}
