package com.niit.spring;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	
	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}
}
