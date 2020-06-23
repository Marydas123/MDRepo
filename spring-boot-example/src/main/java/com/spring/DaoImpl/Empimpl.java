package com.spring.DaoImpl;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.student.Dao.Employee;
@Component
public class Empimpl implements Employee {

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		System.out.println("hdhus");
	}

}
