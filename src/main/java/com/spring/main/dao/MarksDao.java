package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Marks;

@Repository(value = "marksDao")
@Transactional
public class MarksDao {

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Marks save(Marks m) {
		getSession().save(m);
		getSession().flush();
		return m;
	}

	public List<Marks> getAll() {
		List<Marks> mar = getSession().createCriteria(Marks.class).list();
		return mar;
	}

	public Marks getMarksById(String id) {
		String sql = "from marks where id = '" + id + "'";
		List<Marks> mList = getSession().createQuery(sql).list();
		return mList.get(0);
	}

	public Marks update(Marks m) {
		getSession().saveOrUpdate(m);
		getSession().flush();
		return m;
	}

	public Marks delete(Marks m) {
		getSession().delete(m);
		getSession().flush();
		return m;
	}

}
