package com.spring.student;

import org.springframework.beans.factory.annotation.Autowired;

import com.student.Dao.Employee;

public class Student {
	
private	int id;

@Autowired
Employee empl;

private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


public void m1 () {
	empl.insert();
	
}

}
