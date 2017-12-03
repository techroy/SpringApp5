package com.annot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.autowired.beans.Motor;

public class AutowiredTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/annot/config/application-context.xml");

		Motor motor = applicationContext.getBean("motor1", Motor.class);

		motor.run();

	}

}
