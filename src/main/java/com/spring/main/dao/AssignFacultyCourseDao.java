package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.AssignFacultyCourse;

@Repository(value = "assignFacultyCourseDao")
@Transactional
public class AssignFacultyCourseDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public AssignFacultyCourse save(AssignFacultyCourse afc) {
		getSession().save(afc);
		getSession().flush();
		return afc;
	}

	public List<AssignFacultyCourse> getAll() {
		List<AssignFacultyCourse> afcList = getSession().createCriteria(AssignFacultyCourse.class).list();
		return afcList;
	}

	public AssignFacultyCourse getAssignFacultyCourseById(String id) {
		String sql = "from assignFacultyCourse where id = '" + id + "'";
		List<AssignFacultyCourse> afcList = getSession().createQuery(sql).list();
		return afcList.get(0);
	}

	public AssignFacultyCourse update(AssignFacultyCourse afc) {
		getSession().saveOrUpdate(afc);
		getSession().flush();
		return afc;
	}

	public AssignFacultyCourse delete(AssignFacultyCourse afc) {
		getSession().delete(afc);
		getSession().flush();
		return afc;
	}

}
