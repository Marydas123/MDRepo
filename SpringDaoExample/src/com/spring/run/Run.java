package com.spring.run;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.spring.student.Student;

import com.student.Dao.StudentDao;

public class Run {

	static int x = 10;
	int y = 10;

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub

		
		/*
		 * Reader rd = Resources.getResourceAsReader("SqlMapConfig.xml"); SqlMapClient
		 * smc = SqlMapClientBuilder.buildSqlMapClient(rd);
		 */
		 

		ApplicationContext app = new ClassPathXmlApplicationContext("file:application-context.xml");
		StudentDao b = (StudentDao) app.getBean("st");
		int id = 1;
		System.out.println("Going to read record.....");
		Student e = b.selectById(id);

		System.out.println("ID:  " + e.getId());
		System.out.println("First Name:  " + e.getName());

		System.out.println("Record read Successfully ");

		/* Run a1 =new Run(); */
	}

	public static void m1() {
		x = 11;
	}

	public void m2() {
		m1();
	}
}
