package com.example.gitpractice.demogit.entities;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

	private long timestamp;
	private String message;

	public HelloWorld() {
		this.timestamp = System.currentTimeMillis();
		this.message = "Hello World of GIT VCS from the world of Spring";
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
