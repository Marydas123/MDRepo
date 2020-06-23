package com.javatpoint.spring_boot_example;

import org.springframework.stereotype.Component;

@Component
public class Car  implements Vechile{
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Iam Car");
	}

	

}
