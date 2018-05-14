package com.niit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile1 {

	@Autowired
	@Qualifier("student2")
	private Student1 student;
	
	public Profile1()
	{
		System.out.println("inside constructor");
	}
	public void printAge()
	{
		System.out.println("Age: "+student.getAge());
	}
	public void printName()
	{
		System.out.println("Name: "+student.getName());
	}
}
