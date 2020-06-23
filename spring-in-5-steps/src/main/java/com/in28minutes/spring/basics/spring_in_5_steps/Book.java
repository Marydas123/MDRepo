package com.in28minutes.spring.basics.spring_in_5_steps;

import org.springframework.beans.factory.annotation.Autowired;
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
}
