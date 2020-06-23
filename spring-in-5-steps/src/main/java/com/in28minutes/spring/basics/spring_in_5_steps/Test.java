package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = SpringApplication.run(Test.class, args);
Book b =(Book) app.getBean("com.in28minutes.spring.basics.spring_in_5_steps.Book");
b.go();
	}

}
