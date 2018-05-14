package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.niit.service.UserService;

public class SpringAOPTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		
		UserService  userService = (UserService)context.getBean(UserService.class);
		userService.multiply();
		userService.divide(5,0);
	}
}