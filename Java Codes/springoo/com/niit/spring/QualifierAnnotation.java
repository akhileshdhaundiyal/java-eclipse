package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class QualifierAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		
		Profile1 profile = (Profile1)context.getBean("profile");
		profile.printAge();
		profile.printName();

	}

}
