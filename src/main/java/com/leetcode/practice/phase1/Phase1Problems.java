package com.leetcode.practice.phase1;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Phase1Problems {

	@PostConstruct
	public void postConstruct() {
		
		System.out.println("Hello leet 75");
	}
}
