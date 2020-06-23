package com.spring.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan(basePackages = "com.spring.test")
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = SpringApplication.run(Test.class, args);
Book b =(Book) app.getBean("Book");
b.go();
	}

}
