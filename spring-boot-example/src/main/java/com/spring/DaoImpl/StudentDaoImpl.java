package com.spring.DaoImpl;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.spring.student.Student;
import com.student.Dao.StudentDao;

public class StudentDaoImpl extends SqlMapClientDaoSupport implements  StudentDao{

	@Override
	public Student selectById(int id) {
		// TODO Auto-generated method stub
		
		return (Student)getSqlMapClientTemplate().queryForObject("st.stset", id) ;
	}

	@Override
	public void insert(Student e) {
		// TODO Auto-generated method stub
		
	}

}
