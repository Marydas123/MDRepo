package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestServ {

	@RequestMapping(value = "/login")
	public String display() {
		System.out.println("bhksbvks");
		return "test";
	}

}
