package com.niit.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiredAnnotation {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country cObj = (Country) context.getBean("countryBean");
		String cName = cObj.getCountryName();
		Capital capObj = cObj.getCapital();
		String capName=capObj.getCapitalName();
		System.out.println(capName+" is Capital of "+cName);
	}

}
