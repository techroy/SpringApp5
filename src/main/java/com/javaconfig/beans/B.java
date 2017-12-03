package com.javaconfig.beans;

import org.springframework.stereotype.Component;


public class B {
	
	private String name;
	
	
	
	public void setName(String name) {
		this.name = name;
	}



	public void show(){
		
		System.out.println("B show method="+name);
	}

}
