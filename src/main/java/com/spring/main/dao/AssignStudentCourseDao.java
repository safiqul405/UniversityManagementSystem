package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.AssignStudentCourse;

@Repository(value = "assignStudentCourseDao")
@Transactional
public class AssignStudentCourseDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public AssignStudentCourse save(AssignStudentCourse asc) {
		getSession().save(asc);
		getSession().flush();
		return asc;
	}

	public List<AssignStudentCourse> getAll() {
		List<AssignStudentCourse> ascList = getSession().createCriteria(AssignStudentCourse.class).list();
		return ascList;
	}

	public AssignStudentCourse getAssignStudentCourseById(String id) {
		String sql = "from assignStudentCourse where id = '" + id + "'";
		List<AssignStudentCourse> ascList = getSession().createQuery(sql).list();
		return ascList.get(0);
	}

	public AssignStudentCourse update(AssignStudentCourse asc) {
		getSession().saveOrUpdate(asc);
		getSession().flush();
		return asc;
	}

	public AssignStudentCourse delete(AssignStudentCourse asc) {
		getSession().delete(asc);
		getSession().flush();
		return asc;
	}


}
