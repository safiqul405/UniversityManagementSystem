package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Libary;

@Repository(value = "libaryDao")
@Transactional
public class LibaryDao {

	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Libary save(Libary l) {
		getSession().save(l);
		getSession().flush();
		return l;
	}

	public List<Libary> getAll() {
		List<Libary> lib = getSession().createCriteria(Libary.class).list();
		return lib;
	}

	public Libary getLibaryByCode(String bookCode) {
		String sql = "from libary where bookCode = '" + bookCode + "'";
		List<Libary> lList = getSession().createQuery(sql).list();
		return lList.get(0);
	}

	public Libary update(Libary l) {
		getSession().saveOrUpdate(l);
		getSession().flush();
		return l;
	}

	public Libary delete(Libary l) {
		getSession().delete(l);
		getSession().flush();
		return l;
	}

}
