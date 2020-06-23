package com.javatpoint.spring_boot_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = SpringApplication.run(Test.class, args);
Book b = app.getBean(Book.class);
b.go();
	}

}
