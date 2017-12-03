package com.autowired.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="motor1")
public class Motor {

	// attribute level

	// @Autowired
	private Engine engine;

	// setter level injection
	@Autowired(required=false)
	@Qualifier(value="myengine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	// @Autowired
	/*public Motor(Engine engine) {
		super();
		this.engine = engine;
	}*/

	public void run() {

		System.out.println("---running----");
		engine.start();
	}

}
