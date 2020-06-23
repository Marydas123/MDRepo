package com.spring.test;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vechile{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}

}
