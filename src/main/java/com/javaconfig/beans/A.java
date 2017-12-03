package com.javaconfig.beans;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

//@Component
@Named
public class A {

	private B b1;

	/* 
	@Inject
	@Named("b1")
 	public void setB(B b) { this.b = b; }
	 */
	@Resource
	public void setB1(B b1) {
		this.b1 = b1;
	}

	@PostConstruct
	public void init(){
		System.out.println("----init method---");
	}
	
	

	public void test() {

		b1.show();

	}

}
