package com.niit.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	Integer first,second;

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public Integer getSecond() {
		return second;
	}

	public void setSecond(Integer second) {
		this.second = second;
	}
	
	
	public Integer multiply(){
		int res= first*second;
		System.out.println(first+ "*"+second+"="+res);
		return res;
	}
	public Integer divide(int a, int b){
		int res= a/b ;
		System.out.println(a+ "/"+ b +"="+res);
		return res;
	}
}
