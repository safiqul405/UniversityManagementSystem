package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.main.entity.Student;

@Repository(value = "studentDao")
@Transactional
public class StudentDao {

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Student save(Student s) {
		getSession().save(s);
		getSession().flush();
		return s;
	}

	public List<Student> getAll() {
		String sql = "from student";
		List<Student> st = getSession().createQuery(sql).list();
		return st;
	}

	public Student getStudentByCode(String sid) {
		String sql = "from student where sid = '" + sid + "'";
		List<Student> sList = getSession().createQuery(sql).list();
		return sList.get(0);
	}

	public Student update(Student s) {
		getSession().saveOrUpdate(s);
		getSession().flush();
		return s;
	}

	public Student delete(Student s) {
		getSession().delete(s);
		getSession().flush();
		return s;
	}
	public List<Student> getStudentByBatch(String batchCode) {
		// TODO Auto-generated method stub
		String sql = "from student where batchCode = '" + batchCode + "'";
		List<Student> sList = getSession().createQuery(sql).list();
		return sList;
	}
}
