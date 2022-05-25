package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Staff;

@Repository(value = "staffDao")
@Transactional
public class StaffDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Staff save(Staff st) {
		getSession().save(st);
		getSession().flush();
		return st;
	}

	public List<Staff> getAll() {
		List<Staff> staf = getSession().createCriteria(Staff.class).list();
		return staf;
	}

	public Staff getStaffById(String id) {
		String sql = "from staff where id = '" + id + "'";
		List<Staff> stList = getSession().createQuery(sql).list();
		return stList.get(0);
	}

	public Staff update(Staff st) {
		getSession().saveOrUpdate(st);
		getSession().flush();
		return st;
	}

	public Staff delete(Staff st) {
		getSession().delete(st);
		getSession().flush();
		return st;
	}

}
