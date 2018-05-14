package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private UserAccountService uas;

	public Test() {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("account.xml");
		uas = (UserAccountService) context.getBean("userAccountService");
		System.out.println("Name : " + uas.getName());
		System.out.println("Description : " + uas.getDescription());
		System.out.println("Details : " + uas.getDetails());
	}

	public static void main(String[] args) {
		new Test();
	}

}
