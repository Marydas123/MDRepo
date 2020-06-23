package com.javatpoint.spring_boot_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Book {
   @Autowired
	Vechile vechicle;

	public Book(Vechile vechicle) {
		this.vechicle = vechicle;
	}

	public void go() {
		vechicle.run();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext app = SpringApplication.run(Test.class, args);
		/*
		 * Book b =(Book) app.getBean("Book"); b.go();
		 */
	}
}
