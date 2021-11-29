package com.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationClass implements CommandLineRunner {

	@Autowired
	User user;
	public static void main(String[] args) {
		SpringApplication.run(SpringMvc2Q3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		user.setUsername("vinaya");
		user.setPassword("vinaya22");
		
	}

}
