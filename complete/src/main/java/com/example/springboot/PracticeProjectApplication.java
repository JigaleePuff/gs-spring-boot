package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import path.to.JsonDataService;

@SpringBootApplication
public class PracticeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeProjectApplication.class, args);
	}
@GetMapping("/")	
public String greet() {
	return "Hello World!";
}
}
