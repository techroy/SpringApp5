package com.annot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.beans.GreetService;

@Configuration
public class AppConfig {


	@Bean(name="greet")
	public GreetService greetService(){
		
		return new GreetService();
	}
	
	
}
