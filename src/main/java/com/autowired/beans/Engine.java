package com.autowired.beans;

public class Engine {

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void start() {

		System.out.println("-----------started-----"+name);
	}

}
