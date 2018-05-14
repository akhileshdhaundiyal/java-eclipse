package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceAnnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("student.xml");
		PayServiceImpl bean = (PayServiceImpl)context.getBean("payServiceBean");
		context.close();
	}
}
