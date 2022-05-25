package com.spring.main.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.main.entity.Batch;

@Repository(value = "batchDao")
@Transactional
public class BatchDao {
	
	@Autowired
	private EntityManager entityManager;

	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	public Batch save(Batch b) {
		getSession().save(b);
		getSession().flush();
		return b;
	}

	public List<Batch> getAll() {
		List<Batch> bat = getSession().createCriteria(Batch.class).list();
		return bat;
	}

	public Batch getBatchByCode(String batchCode) {
		String sql = "from batch where batchCode = '" + batchCode + "'";
		List<Batch> bList = getSession().createQuery(sql).list();
		return bList.get(0);
	}

	public Batch update(Batch b) {
		getSession().saveOrUpdate(b);
		getSession().flush();
		return b;
	}

	public Batch delete(Batch b) {
		getSession().delete(b);
		getSession().flush();
		return b;
	}

}
