package com.mh09.com.testGithub.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String sayHello( ) {
		return "hello";
	}
	
	@GetMapping("/welcome")
	public String sayWelecome( ) {
		return "welcome";
	}
	
}
