package com.niit.HelloWorldBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldBootApplication {

	@RequestMapping("/")
	String home()
	{
		return "Helelo from Sprring Bhoot";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldBootApplication.class, args);
	}
}