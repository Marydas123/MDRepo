package com.student.Dao;

import java.sql.SQLException;

import com.spring.student.Student;

public interface StudentDao {

	
	public Student  selectById(int id) throws SQLException;
	
	public void insert(Student e);
	
}
