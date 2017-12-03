package com.annot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javaconfig.beans.A;

public class JavaConfigTest {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/annot/config/application-context.xml");
		A a=(A)applicationContext.getBean("a");
		a.test();

	}

}
