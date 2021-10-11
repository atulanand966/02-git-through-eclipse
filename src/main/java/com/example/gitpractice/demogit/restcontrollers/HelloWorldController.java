package com.example.gitpractice.demogit.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.gitpractice.demogit.entities.HelloWorld;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World of Git from Spring Boot";
	}
	
	@GetMapping("/api/hello")
	public HelloWorld sayJSONHello() {
		return new HelloWorld();
	}
}
