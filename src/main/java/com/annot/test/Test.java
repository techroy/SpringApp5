package com.annot.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.annot.config.AppConfig;
import com.test.beans.GreetService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		GreetService greetService = (GreetService) applicationContext.getBean("greet");

		greetService.greet();

	}

}
