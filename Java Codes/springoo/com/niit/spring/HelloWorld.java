package com.niit.spring;

public class HelloWorld {
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void display() {
		System.out.println(" Welcome : " + userName);
	}
}
