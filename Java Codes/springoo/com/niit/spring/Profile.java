package com.niit.spring;

import org.springframework.beans.factory.annotation.Required;

public class Profile {
	private Integer age;
	private String name;

	public Integer getAge() {
		return age;
	}

	@Required
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
